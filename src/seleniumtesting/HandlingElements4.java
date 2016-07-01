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
 * this program is automate when web pages are in frames.
 */
public class HandlingElements4 {
    
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a"));
        
    }
}
