import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BestContributor {
    @Test
    void shouldFindBestContributor() {

        open("https://github.com/selenide/selenide");
        $("ul.list-style-none.d-flex.flex-wrap.mb-n2 li").hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));

    }
}
