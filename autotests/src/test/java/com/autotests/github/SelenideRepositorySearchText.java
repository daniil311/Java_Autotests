package com.autotests.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearchText {
    @Test
    void testWikiSoftAssertions(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(Condition.text("SoftAssertions"));
        $(Selectors.byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5 extend test class"));
        sleep(5000);
    }
}


/*    Разработайте следующий автотест:
        - Откройте страницу Selenide в Github
        - Перейдите в раздел Wiki проекта
        - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5*/
