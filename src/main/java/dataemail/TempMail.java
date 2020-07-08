package dataemail;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.get;

public class TempMail {



    public String checkMail(String login) {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Response response = get("https://www.1secmail.com/api/v1/?action=getMessages&login=" + login + "&domain=1secmail.com");
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.prettyPrint());
        Object id = jsonPath.get("id");
        String s = String.valueOf(id);
        return s.substring(1, s.length() - 1);
    }

    public String getPasswordFromMessage(String login,String idMessage) {
        Response response = get("https://www.1secmail.com/api/v1/?action=readMessage&login=" + login + "&domain=1secmail.com&id=" + idMessage);
        JsonPath jsonPath = response.jsonPath();
        String body = jsonPath.get("body");
        System.out.println(jsonPath.prettyPrint());

        Pattern p = Pattern.compile(".*<p>Пароль: [a-zA-Z0-9]+</p>.*");

        Matcher m = p.matcher(body);
        String res = "";
        if (m.find()) {
            res = m.group();
        }
        Pattern p2 = Pattern.compile("(.* )([a-zA-Z0-9]+)(<.*)");

        Matcher m2 = p2.matcher(res);

        if (m2.find()) {
            return m2.group(2);
        }
        return null;

    }
}
