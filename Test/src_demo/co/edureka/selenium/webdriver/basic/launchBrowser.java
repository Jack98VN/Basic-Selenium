package co.edureka.selenium.webdriver.basic;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class launchBrowser {
    public static WebDriver driver =null;
    public static void main(String []args) throws InterruptedException{

       System.setProperty("webdriver.chrome.driver","C:\\Users\\jacki\\Downloads\\Selenium\\chromedriver.exe   ");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        //open the app
        driver.navigate().to("https://amazon.in");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Amazon.in"))
            System.out.println("Titile Matches");
        else
            System.out.println(title);

        //locate a web elements
        String tagname = "  ";
        tagname = driver.findElement(new By.ByXPath("//select[@class=\"nav-search-dropdown searchSelect\"]")).getText();
        System.out.println(tagname);

        //dropdown
        WebElement All =driver.findElement(new By.ByXPath("//option[@value=\"search-alias=todays-deals\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(All).perform();
        Thread.sleep(2000);

        WebElement books = driver.findElement(new By.ByXPath("//select[@class=\"nav-search-dropdown searchSelect\"]/option[@value=\"search-alias=stripbooks\"]"));
        action.click();
        action.perform();
        Thread.sleep(2000);




        driver.close();
        driver.quit();
    }

}

