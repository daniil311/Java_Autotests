package com.autotests.github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearchAtTheTop {
    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        //ARRANGE //ACT //ASSERT
        //открыть главную страницу
        open("https://github.com/");
        //ввести в поле поиск selenide и нажать enter
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        //кликнуть на первый репозиторий из списка найденных
        $$("[data-testid=results-list] a").first().click();
        //$$("[data-testid=results-list] em").get(0).click();
        //$("[data-testid=results-list] a").click();
        //$$("div.Box-sc-g0xbh4-0 div").first().$("em").click();
        //проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));

        sleep(5000);
    }
}
