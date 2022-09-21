package saucedemoPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverview {
    private By finishButton = By.id("finish");
    public static String testSummaryInfo = ".summary_info";




    ///**///
    ///**///

    public void finishButton(){
        $(finishButton).click();
    }
}
