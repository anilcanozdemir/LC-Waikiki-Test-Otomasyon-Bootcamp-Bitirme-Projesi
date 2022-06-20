package util;

import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static WebDriver driver;
    private static Properties properties;

    public static WebDriver initializeDriver(String browser) {
        properties = ConfigReader.getProperties();
        if (browser == null)
            browser = "Chrome";
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("Android")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("appPackage", "com.lcwaikiki.android");
            capabilities.setCapability("appActivity", "com.lcwaikiki.android.ui.SplashActivity");
            try {
                driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }

        driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicityWait")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("pageLoadTimeout")),TimeUnit.SECONDS);
        return getDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
