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
 * handling duplicate objects, in http://www.gcrit.com web-site, you can visit Online Catalog even if you haven't logged in.
 * the following program will show how to go online Catalog page only after login.
 */
public class HandlingElements6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gcrit.com/build3/admin");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("tdb1")).click();
        String url = driver.getCurrentUrl();
        if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
        {
        driver.findElement(By.linkText("Online Catalog")).click();
        System.out.println(driver.getCurrentUrl());
        }
    }
    
}
