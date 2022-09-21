package saucedemoPages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SaucePage {

    private static String burguerButton = "react-burger-menu-btn";
    public static String testRemoveButton = "#remove-sauce-labs-backpack";
    public static String testBMMenu = ".bm-menu";
    public static String testLogo = ".app_logo";



    ///**///

    ElementsCollection inventoryList = $$(".pricebar > .btn_small ");

    ///**///

    private By shoppingCart = By.cssSelector(".shopping_cart_link");

    ///**///
    ///**///

    public static void clickBurgerButton() {
        $(By.id(burguerButton)).click();
    }

    public ElementsCollection getInventory(){
        return $$(inventoryList);
    }

    public void clickShoppingCart(){
        $(shoppingCart).click();
    }

    ///**///
    ///**///

}
