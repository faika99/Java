package Pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class JSAlertsComponent {
    public void JSAlerts() {
        $("div#HTML9").$(byText("Confirm Box")).click();
        switchTo().alert().accept();
        $("#demo").shouldHave(text("You pressed OK!"));
        $("div#HTML9").$(byText("Prompt")).click();
        switchTo().alert().accept();
        $("#demo").shouldHave(text("Hello Harry Potter! How are you today?"));
    }
}
