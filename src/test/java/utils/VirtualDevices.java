package utils;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;

public class VirtualDevices {
    public static String REMOTE_URL = "https://derianalfaro_mfYQFM:DLpLGRts1LXusZgz5KHw@hub-cloud.browserstack.com/wd/hub";

    public WebDriver device() throws MalformedURLException {
        MutableCapabilities capabilities = new MutableCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("osVersion", "11");
        browserstackOptions.put("deviceName", "iPhone X");
        browserstackOptions.put("realMobile", "true");
        browserstackOptions.put("local", "false");
        capabilities.setCapability("bstack:options", browserstackOptions);

        WebDriver driver = new RemoteWebDriver(new URL(REMOTE_URL), capabilities);
        return driver;
    }
}
