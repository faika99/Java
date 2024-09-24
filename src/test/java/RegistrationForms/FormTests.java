import Pages.FormPageObjects;
import org.junit.jupiter.api.Test;

public class FormTests {
    FormPageObjects formPageObjects = new FormPageObjects();
    @Test
    void shouldTestForm() {
        String name = "Harry Potter",
                email = "Harry@potter.com",
                phone = "89999999999",
                address = "Hogwarts, Griffindor",
                country = "United Kingdom",
                colour = "white",
                birthDate = "07/29/1999";

        formPageObjects.openPage()
                .setName(name)
                .setEmail(email)
                .setPhone(phone)
                .setAddress(address)
                .setGender()
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