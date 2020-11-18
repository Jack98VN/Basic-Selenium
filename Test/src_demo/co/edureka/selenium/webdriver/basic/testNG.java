package co.edureka.selenium.webdriver.basic;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNG {
    /*public WebDriver driver = new ChromeDriver();

    String appUrl = "https://accounts.google.com";*/
        @Test

        public void gmailLogin(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jacki\\Downloads\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://gmail.com");
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        String expectedTitle = "Sign in - Google Accounts";


        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


        WebElement username = driver.findElement(By.id("Email"));
        username.clear();
        username.sendKeys("TestSelenium");

        WebElement password = driver.findElement(By.id("Passwd"));
        password.clear();
        password.sendKeys("password123");

        WebElement SigninButton = driver.findElement(By.id("signIn"));
        SigninButton.click();


    driver.close();
    }
}
