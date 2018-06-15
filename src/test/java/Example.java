import browserManager.Browser;
import factoryBrowser.FactoryBrowser;
import net.bytebuddy.implementation.bytecode.Throw;
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
import pages.Dashboard;
import pages.LeftMenuBar;
import pages.Login;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Example {

    public static  Login loginPage;
    public static Dashboard dashboardPage;
    public static LeftMenuBar leftMenuBarPage;

    @BeforeClass
    public static void openBrowser(){
        loginPage = new Login();
        dashboardPage = new Dashboard();
        leftMenuBarPage = new LeftMenuBar();
    }

    @Test
    public void verifyLogin() throws InterruptedException {

        Browser.getCurrentSession().driver.get("http://todo.ly");
        dashboardPage.loginLink.click();

       // loginPage.userTextBox.set("user");
        // loginPage.pwdTextBox.set("pwd");
        // loginPage.loginButton.click();

        //  Verificaciones
        // Assert.assertTrue("ERROR !! No se pudo ingresar al sistema",
        //                            leftMenuBarPage.logoutLink.isDisplayed());

        // Assert.assertEquals("ERROR !!! el texto no es igual",
        //                     "Logout",
        //                      leftMenuBarPage.logoutLink.getTextValue());


        // Thread.sleep(2000);
        // Browser.getCurrentSession().driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
        // Browser.getCurrentSession().driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Todo.ly");
        // Browser.getCurrentSession().driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).click();
        // Browser.getCurrentSession().driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();

        //Thread.sleep(4000);
        //driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        //driver.findElement(By.id("log")).sendKeys("usr3");
        // driver.findElement(By.id("login")).click();
        // element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
        // Assert.assertNotNull(element);
    }


    @AfterClass
    public  static void closeBrowser(){
        Browser.getCurrentSession().closeBrowser();
    }
}