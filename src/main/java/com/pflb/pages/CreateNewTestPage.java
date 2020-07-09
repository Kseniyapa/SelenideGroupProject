package com.pflb.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CreateNewTestPage {

    /**
     * Локаторы для работы со страницей
     */

    private SelenideElement createNewTestButton = $("section.item_menu_nav.new-test-btn.customer-left-menu > div");  // Открыть окно создания нового теста

    private SelenideElement fieldNameTest = $("[data-testid=\"Test name input\"]"); // Поле для ввода названия теста.

    private SelenideElement fieldWebSite = $("[data-testid=\"Address site input\"]"); // Поле для ввода веб-сайта.

    private SelenideElement goToAudience = $("[data-testid=\"Submit button\"]"); // Кнопка перехода к выбору аудитории.

    private SelenideElement fieldNameSegment = $("[data-testid=\"Segment name input 0\"]"); // Поле для ввода названия сегмента.

    private SelenideElement goToQuestButton = $("[data-testid=\"Tasks button\"]"); // Кнопка перехода к заданиям.

    private SelenideElement fieldForQuestion = $("[data-testid=\"Tasks task question\"]"); // Поле для ввода вопроса.

    private SelenideElement addedQuestionButton = $("[data-testid=\"Tasks submit task\"]"); // Кнопка добавления задания.

    private SelenideElement checkAndRunTestButton = $("[data-testid=\"Check button\"]"); // Кнопка перехода к проверке и запуску теста.

    private SelenideElement rubFreeTestButton = $("[data-testid=\"Checkout start button\"]"); // Запуск бесплатного теста.

    private SelenideElement textAfterCreateNewTest = $("[class = \"sc-itybZL gLzIYc\"]"); // Текст , который появляется после успешного создания теста.

    /**
     * Метод который возвращает текст.
     *
     * @return текст , который выводится после успешного создания теста от клиента.
     */

    public String getTextAfterCreateNewTest() {
        return textAfterCreateNewTest.getText();
    }

    /**
     * Метод для создания нового теста от клиента.
     *
     * @param nameTest    Имя теста.
     * @param website     Адрес сайта , который нужны протестировать.
     * @param nameSegment Имя сегмента.
     * @param question    Создать вопрос.
     */

    public void createNewTest(String nameTest, String website, String nameSegment, String question) {
        createNewTestButton.shouldBe(visible).click();
        fieldNameTest.setValue(nameTest);
        fieldWebSite.setValue(website);
        goToAudience.shouldBe(visible).pressEnter();
        fieldNameSegment.setValue(nameSegment);
        goToQuestButton.shouldBe(visible).pressEnter();
        fieldForQuestion.setValue(question);
        addedQuestionButton.shouldBe(visible).pressEnter();
        checkAndRunTestButton.shouldBe(visible).pressEnter();
        rubFreeTestButton.shouldBe(visible).pressEnter();


    }
}
