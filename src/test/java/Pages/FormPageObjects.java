package Pages;

import Pages.components.JSAlertsComponent;
import Pages.components.NewWindowComponent;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormPageObjects {
    NewWindowComponent newWindowComponent = new NewWindowComponent();
    JSAlertsComponent jsAlertsComponent = new JSAlertsComponent();
    private final SelenideElement
            nameInput = $("#name"),
            emailInput = $("#email"),
            phoneInput = $("#phone"),
            addresInput = $("#textarea"),
            countryInput = $("#country"),
            colourInput = $("#colors"),
            BirtDateInput = $("#datepicker");

    public FormPageObjects openPage() {
        open("https://testautomationpractice.blogspot.com/");

        return this;
    }

    public FormPageObjects setName(String value) {
        nameInput.setValue(value);

        return this;
    }
    public FormPageObjects setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public FormPageObjects setPhone(String value) {
        phoneInput.setValue(value);

        return this;
    }

    public FormPageObjects setAddress(String value) {
        addresInput.setValue(value);

        return this;
    }

    public FormPageObjects setGender() {
        $("#male").click();

        return this;
    }

    public FormPageObjects chooseDays() {
        $("#monday").click();
        $("#saturday").click();

        return this;
    }
    public FormPageObjects chooseCountry(String text) {
        countryInput.selectOptionContainingText(text);

        return this;
    }

    public FormPageObjects chooseColour(String value) {
        colourInput.selectOptionByValue(value);

        return this;
    }

    public FormPageObjects setBirthDate(String value) {
        BirtDateInput.setValue(value).pressEnter();

        return this;
    }
    public FormPageObjects checkTable(String text) {
        $("table[name=BookTable] tr").
                shouldHave(text(text));

        return this;
    }
    public FormPageObjects checkboxTable(String text) {
        $("ul#pagination").$(byText(text)).click();
        $("table#productTable tbody tr").$("[type=checkbox").click();

        return this;
    }
    public FormPageObjects wikipediaSearch(String key, String text) {
        $("#Wikipedia1_wikipedia-search-input").setValue(key).pressEnter();
        $("#Wikipedia1_wikipedia-search-results").shouldHave(text(text));

        return this;
    }

    public FormPageObjects openNewWindow() {
        newWindowComponent.NewWindow();

        return this;
    }

    public FormPageObjects JSAlerts() {
        jsAlertsComponent.JSAlerts();

        return this;
    }

    public FormPageObjects doubleClick() {
        $("div#HTML10 button").doubleClick();
        $("#field2").shouldHave(value("Hello World!"));

        return this;
    }

    public FormPageObjects dragAndDrop() {
        actions().moveToElement($("#draggable")).dragAndDropBy($("#draggable"),140, 32).perform();;
        $("div#droppable p").shouldHave(text("Dropped!"));

        return this;
    }

    public FormPageObjects moveSlider() {
        actions().moveToElement($("div#slider span")).clickAndHold().moveByOffset(100, 0).release().perform();
        $("div#slider span").shouldHave(attribute("style", "left: 32%;"));

        return this;
    }

    public FormPageObjects changeSize() {
        actions().moveToElement($(".ui-icon-gripsmall-diagonal-se")).clickAndHold().moveByOffset(0, -70).release().perform();
        $("#resizable").shouldHave(attribute("style", "height: 62.4px;"));

        return this;
    }
}