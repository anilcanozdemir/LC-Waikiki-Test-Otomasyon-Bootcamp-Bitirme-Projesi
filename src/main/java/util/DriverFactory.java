package util;

import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initializeDriver(String browser) {
        properties = ConfigReader.getProperties();

        if (browser == null)
            browser = "Chrome";
        if (browser.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-blink-features=AutomationControlled");
            driver = new ChromeDriver(options);
            if (properties == null) {
                driver.get("https://www.lcwaikiki.com/tr-TR/TR");
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            } else {
                String url = properties.getProperty("url");
                //Properties properties
                driver.get(url);
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(properties.getProperty("implicityWait")), TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("pageLoadTimeout")), TimeUnit.SECONDS);

            }
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
            if (properties == null)
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            else
                driver.manage().timeouts().implicitlyWait(Integer.parseInt(properties.getProperty("implicityWait")), TimeUnit.SECONDS);

        }


        return getDriver();
    }

    public static WebDriver getDriver() {
        if (driver == null)
            return initializeDriver(null);
        return driver;
    }
}
