/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_object_model;

import com.sun.media.jfxmedia.logging.Logger;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author avidekar
 * We need to build Object Repository which should be maintainable and accessible
 * on demand.Page Object Model (POM) is a popular design pattern to create an 
 * Object Repository in which each one of those web elements properties are 
 * created using a class file.
 * In the last method, it takes a screen shot of the output.
 * The code also takes a video of the entire process.
 */
public class PageObjectPercCalc {
    
    private static WebElement element = null;
    
    //Math Calculator Link
    public static WebElement mathCalculatorLink(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a"));
        return element;
    }
    
    //Percentage Calculator Link
    public static WebElement percentageCalculatorLink(WebDriver driver)
    {
        element = driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]"));
        return element;
    }
    
    //textbox 1 
    public static WebElement textBox1(WebDriver driver)
    {
        element = driver.findElement(By.id("cpar1"));
        return element;
    }
    
    //textbox 2	
   public static WebElement textBox2(WebDriver driver)
   {
      element = driver.findElement(By.id("cpar2"));
      return element;
   }
	
   //Calculate Button	
   public static WebElement calculate(WebDriver driver)
   {
      element = driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]"));
      return element;
   }	
	
   // Result	
   public static WebElement result(WebDriver driver) throws IOException 
   {
       try
       {
        element = driver.findElement(By.xpath(".//*[@id='cpar456893']"));
        return element;
       }
       catch(Exception e1)
       {
           //code to take screen shot of the last window.
           File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(screenshot, new File("/Users/john/Desktop/screenshot.jpg"));
           throw(e1);
       }
   }	
}
