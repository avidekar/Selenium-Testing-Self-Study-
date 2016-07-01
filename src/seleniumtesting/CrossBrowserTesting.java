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
public class CrossBrowserTesting {
    
    public static void main(String[] args) {
        
        
        //<-------- TEST CASE FOR FIREFOX --------------->
        /*WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        if(pageTitle.equals("Google")){
            System.out.println("Google Application Launched - Test Case Passed!");
        }
        else{
            System.out.println("Test Case Failed");
        }
        
        //driver.close();
        
        */
                //<-------- TEST CASE FOR GOOGLE CHROME --------------->
        System.setProperty("webdriver.chrome.driver","/Users/john/Desktop/IMPORTANT/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        if(pageTitle.equals("Google")){
            System.out.println("Google Application Launched - Test Case Passed!");
        }
        else{
            System.out.println("Test Case Failed");
        }
        
        //driver.close();
    }
    
}
