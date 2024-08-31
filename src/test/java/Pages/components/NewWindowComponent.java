package Pages.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class NewWindowComponent {
    public void NewWindow() {
        $("div#HTML4 button").click();
        sleep(2000);
        switchTo().window(1);
        $("#logo").shouldBe(visible);
        switchTo().window(0);
    }
}
