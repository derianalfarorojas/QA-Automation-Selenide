package browsermanagement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
    public static void setChrome() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("selenide.browser", "Chrome");
    }
}
