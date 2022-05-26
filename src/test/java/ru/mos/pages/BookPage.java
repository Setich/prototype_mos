package ru.mos.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BookPage {

    public BookPage verifyAnnotationBook(String value) {
        $(".book__info-bottom-text").shouldHave(text(value));

        return this;
    }
}
