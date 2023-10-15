package com.autotests.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


class BestContributorToSelenideTheTopContributor {

  @Test
  void solntsevShouldBeTheTopContributor() {
    // открыть страницу репозитория селенида
    open("https://github.com/selenide/selenide");
    // подвести мышку к первому аватару из блока contributors
    $(".BorderGrid").$(Selectors.byText("Contributors")).ancestor(".BorderGrid-cell")
            .$$("ul li").first().hover();
    // проверка: во всплывающем окне есть текст Andrei Solntsev
    $$(".Popover").findBy(Condition.visible).shouldHave(Condition.text("Andrei Solntsev"));
    $x("//div").shouldBe(visible);

    sleep(5000);
  }


}


