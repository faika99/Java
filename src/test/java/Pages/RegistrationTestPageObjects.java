package Pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTestPageObjects {
    private final SelenideElement
            nameInput = $("#name"),
            surnameInput = $("#surname"),
            emailInput = $("#email"),
            passwordInput = $("#password"),
            confirm_passwordInput = $("#confirm_password");
    public RegistrationTestPageObjects openPage() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        open("https://lm.skillbox.cc/qa_tester/module05/practice2/");

        return this;
    }

    public RegistrationTestPageObjects setName(String value) {
        nameInput.setValue(value);

        return this;
    }

    public RegistrationTestPageObjects setSurname(String value) {
        surnameInput.setValue(value);

        return this;
    }

    public RegistrationTestPageObjects setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public RegistrationTestPageObjects setPassword(String value) {
        passwordInput.setValue(value);

        return this;
    }

    public RegistrationTestPageObjects setCofirmPassword(String value) {
        confirm_passwordInput.setValue(value);

        return this;
    }

    public RegistrationTestPageObjects setAgreeCheckbox() {
        $(".form-label-agree").click();

        return this;
    }

    public RegistrationTestPageObjects SubmitButton() {
        $(".form-submit").click();

        return this;
    }

    public RegistrationTestPageObjects sucsessfulRegistration(String value) {
        $(".form-wrapper").shouldHave(text(value));

        return this;
    }
}
