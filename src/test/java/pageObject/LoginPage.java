package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Browser;

public class LoginPage
{
    public WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@class='input']")
    public WebElement txtUsername;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement btnLogin;

    @FindBy(xpath = "//*[a='Forgot login info?']")
    public WebElement linkForgotInfo;

    @FindBy(xpath = "//*[contains(text(),'Register')]")
    public WebElement linkRegister;

    @FindBy(xpath = "//li[@class='Solutions']")
    public WebElement linkSolution;

    @FindBy(xpath="//*[contains(text(),'About Us')]")
    public WebElement linkAboutUs;

    @FindBy(xpath="//*[contains(text(),'Services')]")
    public WebElement linkServices;

    @FindBy(xpath = "//*[contains(text(),'Products')]")
    public WebElement linkProducts;

    @FindBy(xpath = "//*[contains(text(),'Locations')]")
    public WebElement linkLocations;

    @FindBy(xpath = "//*[contains(text(),'Admin Page')]")
    public WebElement linkAdminPage;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        this.wait=new WebDriverWait(driver,20);
    }

    public void enterUsername(String username)
    {
        WebElement element=wait.until(ExpectedConditions.visibilityOf(txtUsername));
        element.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        WebElement element=wait.until(ExpectedConditions.visibilityOf(txtPassword));
        element.sendKeys(password);
    }

    public void clickLoginButton()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        element.click();
    }
    public void clickRegisterInfo()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkForgotInfo));
        element.click();
    }

    public void clickRegister()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkRegister));
        element.click();
    }

    public void clickSolution()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkSolution));
        element.click();
    }

    public void clickAboutUs()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkAboutUs));
        element.click();
    }

    public void clickServices()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkServices));
        element.click();
    }

    public void clickProducts()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkProducts));
        element.click();
    }

    public void clickLocations()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkLocations));
        element.click();
    }

    public void clickAdminPage()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(linkAdminPage));
        element.click();
    }

}
