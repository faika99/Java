import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests1 {
    @Test
    void sucsessfulRegistrationTests1() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";

        open("https://lm.skillbox.cc/qa_tester/module05/practice2/");

        $("#name").setValue("Alexandr");
        $("#surname").setValue("Pushkin");
        $("#email").setValue("stihi@example.com");
        $("#password").setValue("123qwe..");
        $("#confirm_password").setValue("123qwe..");
        $(".form-label-agree").click();
        $(".form-submit").click();

        $(".form-wrapper").shouldHave(text("спасибо за регистрацию!"));
    }
}