import RegistrationForms.RegistrationTestPageObjects;

import org.junit.jupiter.api.Test;

public class RegistrationTests1 {
    RegistrationTestPageObjects registrationTestPageObjects = new RegistrationTestPageObjects();
    @Test
    void sucsessfulRegistrationTests1() {
        String name = "Alexandr";
        String surname = "Pushkin";
        String email = "stihi@example.com";
        String password = "123qwe..";
        String confirm_password = "123qwe..";

        registrationTestPageObjects.openPage()
                .setName(name)
                .setSurname(surname)
                .setEmail(email)
                .setPassword(password)
                .setCofirmPassword(confirm_password)
                .setAgreeCheckbox()
                .SubmitButton()
                .sucsessfulRegistration("спасибо за регистрацию!");
    }
}