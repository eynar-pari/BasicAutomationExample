import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Example {
    private static ChromeDriver driver;
    WebElement element;



    @BeforeClass
    public static void openBrowser(){
        String PATH_PROJECT=new File(".").getAbsolutePath().replace(".","");

        System.setProperty("webdriver.chrome.driver", PATH_PROJECT+"src\\test\\java\\drivers\\chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-memory-info");
        options.addArguments("--no-sandbox");
        options.setExperimentalOption("prefs", prefs);

        driver =  new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void valid_UserCredential(){

        driver.get("ulr");

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        driver.findElement(By.id("log")).sendKeys("usr3");
        driver.findElement(By.id("login")).click();

        element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));

        Assert.assertNotNull(element);
    }


    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}