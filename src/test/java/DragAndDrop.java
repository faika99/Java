import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void ChangePlaces() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("div#column-a header").shouldHave(text("A"));
        actions().dragAndDropBy($("#column-a"), 200, 0).perform();
        $("div#column-a header").shouldHave(text("B"));
        $("div#column-b header").shouldHave(text("A"));
    }
}
