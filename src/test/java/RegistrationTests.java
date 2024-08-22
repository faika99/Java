import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests {
    @Test
    void sucsessfulLoginTest() {
        Configuration.holdBrowserOpen = true;

        open("https://ticket.flypobeda.ru/websky/?showLoginPopup=1&lang=ru#/search");

        $("[modal-link=popup-registration]").click();

        $("[name=email").setValue("ya.faika@yandex.ru");
        $("[name=password").setValue("12345q");
        $("[name=passwordRepeat").setValue("12345q");
        $("[name=firstName").setValue("Фаина");
        $("[name=lastName").setValue("Шестакова");
        $("[name=phone").click();
        $("[name=phone").setValue("79991234567");
        $(".skybox__check").click();
        $(".popup__i__footer__buttons__button").click();

    }
}
