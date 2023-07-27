package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Browser
{
    private String browserName;
    public static WebDriver driver;

    public Browser(String browserName)
    {
        this.browserName=browserName;
    }

    public String getBrowserName()
    {
        return browserName;
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public void launchBrowser()
    {
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
        }

        else
        {
            System.out.println("The browser provided is not available");
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void maximize()
    {
        driver.manage().window().maximize();

    }

    public void navigateUrl(String url)
    {
        driver.get(url);
    }

    public void closeBrowser()
    {
        driver.close();
        driver.quit();
    }
}