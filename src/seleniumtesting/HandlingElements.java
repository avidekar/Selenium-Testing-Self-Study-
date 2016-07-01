/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author avidekar
 * this program is to handle the window pop up.
 */
public class HandlingElements {
    
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Alert alert = driver.switchTo().alert();
        String error = alert.getText();
        System.out.println(error);
        alert.accept();
        
    }
    
}


