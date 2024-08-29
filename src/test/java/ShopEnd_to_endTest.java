import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ShopEnd_to_endTest {
    @Test
    void end_to_endTest() {

        open("https://velopodolsk.ru/");
        $(".row.large-columns-3.medium-columns-.small-columns-2.row-normal").$(byText("Подростковые велосипеды")).click();
        $(byAttribute("data-product_id", "1289")).click();
        sleep(2000);
        $(byAttribute("data-product_id", "1290")).click();
        sleep(2000);
        $(".cart-icon").click();
        $(".checkout-button.button.alt.wc-forward.wp-element-button").click();
        $("#shipping_method_0_flat_rate4").click();
        $("#billing_first_name").setValue("Иван");
        $("#billing_address_1").setValue("Арбатская, 29");
        $("#billing_address_2").setValue("1");
        $("#billing_city").setValue("Подольск");
        $("#billing_postcode").setValue("110476");
        $("#billing_phone").setValue("89991234567");
        $("#billing_email").setValue("ivan@test.com");
        $("#place_order").click();
        $("div.is-well.col-inner.entry-content p strong").shouldHave(text("Ваш заказ принят. Благодарим вас."));
    }
}
