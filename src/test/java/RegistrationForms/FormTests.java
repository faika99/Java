import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {
    @Test
    void shouldTestForm() {

        open("https://testautomationpractice.blogspot.com/");
        $("#name").setValue("Harry Potter");
        $("#email").setValue("Harry@potter.com");
        $("#phone").setValue("89999999999");
        $("#textarea").setValue("Hogwarts, Griffindor");
        $("#male").click();
        $("#monday").click();
        $("#saturday").click();
        $("#country").selectOptionContainingText("United Kingdom");
        $("#colors").selectOptionByValue("white");
        $("#datepicker").setValue("07/29/1999").pressEnter();
        $("table[name=BookTable] tr").shouldHave(text("BookName Author Subject Price"));
        $("ul#pagination").$(byText("3")).click();
        $("table#productTable tbody tr").$("[type=checkbox").click();
        $("#Wikipedia1_wikipedia-search-input").setValue("mos").pressEnter();
        $("#Wikipedia1_wikipedia-search-results").shouldHave(text("Moscow"));
        // New Browser Window
        $("div#HTML4 button").click();
        sleep(2000);
        switchTo().window(0);
        // JS Alerts
        $("div#HTML9").$(byText("Confirm Box")).click();
        switchTo().alert().accept();
        $("#demo").shouldHave(text("You pressed OK!"));
        $("div#HTML9").$(byText("Prompt")).click();
        switchTo().alert().accept();
        $("#demo").shouldHave(text("Hello Harry Potter! How are you today?"));
        // Double click
        $("div#HTML10 button").doubleClick();
        $("#field2").shouldHave(value("Hello World!"));
        // Drag and drop
        actions().moveToElement($("#draggable")).dragAndDropBy($("#draggable"),140, 32).perform();;
        $("div#droppable p").shouldHave(text("Dropped!"));
        // Slider
        actions().moveToElement($("div#slider span")).clickAndHold().moveByOffset(100, 0).release().perform();
        $("div#slider span").shouldHave(attribute("style", "left: 32%;"));
        // Resizable
        actions().moveToElement($(".ui-icon-gripsmall-diagonal-se")).clickAndHold().moveByOffset(0, -70).release().perform();
        $("#resizable").shouldHave(attribute("style", "height: 62.4px;"));
    }
}