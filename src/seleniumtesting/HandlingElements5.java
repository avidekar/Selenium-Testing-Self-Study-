/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author avidekar
 * 
 * Program to check mouse events.
 */
public class HandlingElements5 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.carmax.com/");
        //create actio builder instacne using webdriver instance
        Actions builder = new Actions(driver);
        WebElement menuElement = driver.findElement(By.linkText("SELL YOUR CAR"));
        builder.moveToElement(menuElement).build().perform();
        driver.findElement(By.linkText("What You'll Need")).click();
        
    }
}
