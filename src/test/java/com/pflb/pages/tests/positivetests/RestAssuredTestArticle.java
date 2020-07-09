package com.pflb.pages.tests.positivetests;


import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class RestAssuredTestArticle {

    @Test
    public void getResource() {
        when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .assertThat().body("id", equalTo(1), "userId", equalTo(1))
                .log().all();
    }

    @Test
    public void postCreateResource() {
        given()
                .contentType(ContentType.JSON).accept(ContentType.JSON)
                .body("{\n" +
                        "    \"title\": \"foo\",\n" +
                        "    \"body\": \"bar\",\n" +
                        "    \"userId\": \"1\"\n" +
                        "}")
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(201).log().all();
    }

    @Test
    public void putUpdateResource() {
        given()
                .header("Content-Type", "Application/Json")
                .body("{\n" +
                        "    \"id\": \"1\",\n" +
                        "    \"title\": \"foo\",\n" +
                        "    \"body\": \"bar\",\n" +
                        "    \"userId\": \"1\"\n" +
                        "}")
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200).log().all();
    }
}