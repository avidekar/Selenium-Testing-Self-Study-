/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author avidekar
 */
public class WebDriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/john/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.print(title);
        //String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
        driver.navigate().to("https://www.yahoo.com"); //will navigate to the new URL.
        System.out.println(driver.getCurrentUrl());
    }
    
}
