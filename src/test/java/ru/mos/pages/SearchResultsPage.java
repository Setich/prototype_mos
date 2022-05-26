package ru.mos.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {

    public SearchResultsPage numberOfInstancesFound(String value) {
        $(".search__content-header").shouldBe(text(value));

        return this;
    }

    public SearchResultsPage selectTheAuthorFilter(String author) {
        $(".filters__body div.filter-block").click();
        $(".multi-select__checkbox").click();
        $(".multi-select__content--is-opened .button--type-button").click();
        $(".multi-select__selected .checkbox__label--is-checked").shouldBe(text(author));

        return this;
    }

    public SearchResultsPage checkingTheRequiredBook(String bookName) {
        $(".search__results").shouldBe(text(bookName));

        return this;
    }

    public SearchResultsPage selectionBook(String bookName){
        $(".search__results").$(byText(bookName)).click();

        return this;
    }
}
