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
public class AdminLogin {
    
    /* This program is test on Firefox Browser to check if login
       is done successfully or not. 
    */
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver(); //launches firefox browser with blank URL
        driver.get("http://www.gcrit.com/build3/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin@123");
        driver.findElement(By.id("tdb1")).click();
        
        String url = driver.getCurrentUrl();
        if(url.equals("http://www.gcrit.com/build3/admin/index.php"))
        {
            System.out.println(("LOGIN - SUCCESSFUL!"));
        }
        else{
            System.out.println("LOGIN - FAILED");
        }
        driver.close(); //closes the browser
    }
    
}
