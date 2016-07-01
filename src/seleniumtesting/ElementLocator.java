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

/**
 *
 * @author avidekar
 */
public class ElementLocator {
    
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("London");
        email.clear();
        /* use the above two/three lines when you to use manipulate the data 
        or the below line (currently commented) */
        //driver.findElement(By.id("Email")).sendKeys("India");
        //driver.findElement(By.linkText("Gmail")).click(); this is to click on an link on google
        //      OR USE
        //driver.findElement(By.partialLinkText("Gma")).click();
        
        
    }
    
}
