import Pages.FormPageObjects;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {
    FormPageObjects formPageObjects = new FormPageObjects();
    @Test
    void shouldTestForm() {
        String name = "Harry Potter";
        String email = "Harry@potter.com";
        String phone = "89999999999";
        String address = "Hogwarts, Griffindor";
        String country = "United Kingdom";
        String colour = "white";
        String birthDate = "07/29/1999";

        formPageObjects.openPage()
                .setName(name)
                .setEmail(email)
                .setPhone(phone)
                .setAddress(address)
                .chooseDays()
                .chooseCountry(country)
                .chooseColour(colour)
                .setBirthDate(birthDate)
                .checkTable("BookName Author Subject Price")
                .checkboxTable("3")
                .wikipediaSearch("mos", "Moscow")
                .openNewWindow()
                .JSAlerts()
                .doubleClick()
                .dragAndDrop()
                .moveSlider()
                .changeSize();
    }
}