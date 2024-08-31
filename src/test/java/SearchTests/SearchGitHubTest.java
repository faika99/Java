import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchGitHubTest {
    @Test
    void shouldFindSelenideRepository() {

        open("https://github.com/");
        $(".mr-2.color-fg-muted").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("div.kXssRI div").shouldHave(text("selenide/selenide")).$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        $("#wiki-tab").click();
        $(".wiki-more-pages-link button").click();
        $(".js-wiki-sidebar-toggle-display").shouldHave(text("SoftAssertions"));
    }
}
