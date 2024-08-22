import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests1 {
    @Test
    void successfulSearchTest() {
        Configuration.holdBrowserOpen = true;

        open("https://ru.wikipedia.org/");

        $("[name=search]").setValue("Java").pressEnter();
        $(".searchmatch").click();
        $(".nowrap").shouldHave(text("1995"));
    }
}
