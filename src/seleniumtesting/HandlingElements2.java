/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author avidekar
 */
public class HandlingElements2 {
    
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        //driver.findElement(By.className("gb_P")).click();
        //use any one these commands to open Gmail link.
        //driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("Gma")).click();
        driver.findElement(By.cssSelector(".gb_P")).click();
        
    }
    
}
