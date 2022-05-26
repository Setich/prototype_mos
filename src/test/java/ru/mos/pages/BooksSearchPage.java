package ru.mos.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BooksSearchPage {

    public BooksSearchPage openPage(String address) {
        open(address);

        return this;
    }

    public BooksSearchPage infoBlock(String value) {
        $("#about-service").click();
        $(".about-service__content-text").shouldHave(text(value));

        return this;
    }

    public BooksSearchPage searchBook(String value) {
        $(".search-input__field").setValue(value);
        $(".button--type-button").click();

        return this;
    }
}
