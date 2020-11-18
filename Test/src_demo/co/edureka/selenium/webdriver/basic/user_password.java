package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class user_password {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\jacki\\Downloads\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://smartmotor.vn/login.html");
        driver.findElement(new By.ByXPath("//input[@class='p-input'and@id='username']")).isEnabled();


            driver.findElement(new By.ByXPath("//input[@class='p-input'and@id='username']")).sendKeys("admin01");
            driver.findElement(new By.ByXPath("//input[@class='p-input'and@id='password']")).sendKeys("pwd01");
            driver.findElement(new By.ByXPath("//input[@type='button']")).click();

            System.out.println("Successfully !");




        driver.close();
    }
}
