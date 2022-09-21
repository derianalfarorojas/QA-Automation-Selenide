package saucedemoPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private static String firstname = "first-name";
    private static String lastname = "last-name";
    private static String zip = "postal-code";
    private By continueButton = By.id("continue");



    ///**///
    ///**///

    public static void checkout(String firstName, String lastName, String Zip){
        $(By.id(firstname)).val(firstName);
        $(By.id(lastname)).val(lastName);
        $(By.id(zip)).val(Zip);
    }

    public void clickContinueButton(){
        $(continueButton).click();
    }

}
