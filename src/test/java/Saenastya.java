import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Saenastya {
    @Test
    void TestWebSaenastya() {
        open("https://matrix-saenastya.ru/#rec658033148");

        sleep(5000);
        $(".t396__elem.tn-elem.tn-elem__6580331481699197055871.t-animate.t-animate_started").shouldHave(text("начинается")).shouldBe(visible);
        $(".tn-elem__6580331481699197055893").click();
        switchTo().window(1);
        $("div.tgme_page_title span").shouldHave(text("всем намасте, я настя"));
        switchTo().window(0);
        $(".tn-elem__6695182601700567461186").click();
        $("div.tn-elem__6695182601700412110876 ol li").shouldHave(text("Заряженные, активные, большой запас энергии"));
        $(".tn-elem__6695182601700567844646").click();
        $("div.tn-elem__6695182601700491745236 ol li").shouldHave(text("Не имеют связи с родом, не общаются с семьей"));
        $(".tn-elem__6670607361699959515476").click();
        $(".tn-elem__6670607361699959515476").shouldHave(attribute("class", "t396__elem tn-elem tn-elem__6670607361699959515476 js-sbs-anim-trigger_click t-sbs-anim_started"));
        $(".tn-elem__6670607361699959515476").click();
        $(".tn-elem__6670607361699959515476").shouldHave(attribute("class", "t396__elem tn-elem tn-elem__6670607361699959515476 js-sbs-anim-trigger_click t-sbs-anim_started t-sbs-anim_reversed"));
        $(".tn-elem__6665672041699883861510").click();
        $(".tn-elem__6665700721699878303569").shouldHave(text("Матрица совместимости поможет узнать о таких аспектах отношений:"));
        $(".tn-elem__6664268591699865354831").click();
        switchTo().window(2);
        $(".tgme_page_extra").shouldHave(text("\n" + "@steeexa"));
        switchTo().window(0);
        $(".tn-elem__6644015981648032592791").click();
        $(".tn-elem__6600417841699351779811").shouldBe(visible).shouldHave(text("Настя"));
    }
}
