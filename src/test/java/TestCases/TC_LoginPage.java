package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import utility.Browser;
import utility.TestDataReader;

import java.util.Properties;

public class TC_LoginPage {

    Browser br;
    WebDriver driver;
    Properties browser;
    Properties testcase;
    LoginPage loginPage;

    @BeforeSuite
    public void readBrowser()
    {
        browser= TestDataReader.readProperties("Browser.properties");
        br=new Browser(browser.getProperty("browser"));
    }

    @BeforeMethod
    public void readData()
    {
        br.launchBrowser();
        br.maximize();
        driver=br.getDriver();
        loginPage=new LoginPage(br.getDriver());
    }

    @Test
    public void TC_Login()
    {
        testcase=TestDataReader.readProperties("LoginPage.properties");
        br.navigateUrl(browser.getProperty("url"));
       /* loginPage.enterUsername(testcase.getProperty("username"));
        loginPage.enterPassword(testcase.getProperty("password"));
        loginPage.clickLoginButton();
        loginPage.clickRegisterInfo();
        loginPage.clickRegister();*/
        loginPage.clickSolution();
        loginPage.clickAboutUs();
        loginPage.clickServices();
        loginPage.clickProducts();
        loginPage.clickLocations();
        loginPage.clickAdminPage();
    }
}
