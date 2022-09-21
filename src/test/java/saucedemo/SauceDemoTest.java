package saucedemo;

import browsermanagement.BrowserManager;
import utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import saucedemoPages.*;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SauceDemoTest {

    private LoginSaucePage loginSaucePage;
    private SaucePage saucePage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private CheckoutOverview checkoutOverview;
    private CheckoutCompletePage checkoutCompletePage;

    ///**///

    VirtualDevices virtualDevices;

    ///**///

    String standard_user = "standard_user";
    String secret_sauce = "secret_sauce" ;
    String firstName = "testFirst";
    String lastName = "testLast";
    String zip = "testZip";

    ///**///
    ///**///


    @BeforeClass
    public void setup() throws MalformedURLException {
        ///////Selenide////////

        BrowserManager.setChrome();
        open("https://www.saucedemo.com/");

        ///////Selenide////////


        ///////BrowserStack////////

       // virtualDevices = new VirtualDevices();
       // driver = virtualDevices.device();
       // driver.get("https://www.saucedemo.com/");

        ///////BrowserStack////////

        loginSaucePage = new LoginSaucePage();
        saucePage = new SaucePage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        checkoutOverview = new CheckoutOverview();
        checkoutCompletePage = new CheckoutCompletePage();
    }

    ///**///
    ///**///


    @Test(priority = 1)
    public void sauceDemoLogin() throws InterruptedException {
        loginSaucePage.login(standard_user,secret_sauce);
        $(saucePage.testLogo).shouldBe(appear);
    }

    @Test(priority = 2)
    public void hamburguer() throws InterruptedException {
        saucePage.clickBurgerButton();
        $(saucePage.testBMMenu).shouldBe(appear);
    }

    @Test(priority = 3)
    public void addToCart() throws InterruptedException {
        saucePage.getInventory().get(0).click();
       // $$((Collection<? extends WebElement>) saucePage.getInventory().get(0).shouldHave(text("Remove")));
        int numberOfAdd2 = saucePage.getInventory().size();
        System.out.println(numberOfAdd2);
        $(saucePage.testRemoveButton).shouldBe(appear);
        saucePage.clickShoppingCart();
    }

    @Test(priority = 4)
    public void cart() throws InterruptedException {
        $(By.linkText(cartPage.backPackTest)).shouldBe(appear);
        cartPage.clickCheckoutButton();

    }

    @Test(priority = 5)
    public void checkout() throws InterruptedException {
        checkoutPage.checkout(firstName,lastName,zip);
        checkoutPage.clickContinueButton();
        $(By.cssSelector(checkoutOverview.testSummaryInfo)).shouldBe(visible);
        checkoutOverview.finishButton();
        $(By.cssSelector(checkoutCompletePage.messageThanksTest)).shouldBe(visible);

    }

}
