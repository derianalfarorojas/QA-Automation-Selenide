package saucedemoPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private By checkoutButton = By.id("checkout");
    public static String backPackTest = "Sauce Labs Backpack";



    ///**///
    ///**///

    public void clickCheckoutButton(){
        $(checkoutButton).click();
    }
}
