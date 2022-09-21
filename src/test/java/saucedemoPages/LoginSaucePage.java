package saucedemoPages;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginSaucePage {
    private static String username = "user-name";
    private static String password = "password";

    ///**///
    ///**///

    public static void login(String one, String secret_sauce){
        $(By.id(username)).val(one).pressTab();
        $(By.id(password)).val(secret_sauce).pressEnter();
    }




}
