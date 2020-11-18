package com.Flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    //public static driverManager ? vì khi call không cần new lại
    //2.chrome and extend: fire fox, URL
    // Method: create ,quit , get(dành cho navigate)
    //
    public static WebDriver getDriver(){
        return new ChromeDriver();
    }
}
