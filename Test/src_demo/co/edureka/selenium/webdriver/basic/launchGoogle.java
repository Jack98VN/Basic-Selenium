package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class launchGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacki\\Downloads\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.findElement(new By.ByXPath("//input[@name='q']")).isEnabled();

        WebElement btnSearch = driver.findElement(new By.ByXPath("//div[@class=\"FPdoLc tfB0Bf\"]//input[@class='gNO89b']"));
//        System.out.println("Google search Text box is Enabled.");
        driver.findElement(new By.ByXPath("//input[@name='q']")).sendKeys("Webdriver Test Successful");
        btnSearch.click();
        Assert.assertEquals(driver.getTitle(),"Google","Title should correct");



        driver.close();

    }
}
