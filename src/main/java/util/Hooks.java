package util;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

import java.util.Properties;

public class Hooks {

    WebDriver driver;
    Properties properties;
    @Before
    public void before() {
        String browser;
        try{ browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");}
        catch (Exception e)
        {
            browser="Android";
        }

        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initializeDriver(browser);
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
      //  driver.quit();
    }
}
