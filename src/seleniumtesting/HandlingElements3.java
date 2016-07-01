/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author avidekar
 */
public class HandlingElements3 {
    
    public static void main(String[] args) {
        
       WebDriver driver = new FirefoxDriver();
       //driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=u8c1t37ekuckahqsl01239jcu4");
       //<<---------- FOR RADIO BUTTON ------------------>>
       /* WebElement maleRadioButton = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
       boolean elementStatus = maleRadioButton.isDisplayed();
       System.out.println(elementStatus); //true
       System.out.println(maleRadioButton.isEnabled()); //true
       System.out.println(maleRadioButton.isSelected()); //false
       maleRadioButton.click();
       System.out.println(maleRadioButton.isSelected()); //true
       */
       
       
       //<<---------- FOR DROP DOWN ------------------>>
       /* Select dropDown = new Select(driver.findElement(By.name("country")));
       //dropDown.selectByIndex(2);
       //dropDown.selectByVisibleText("India");
       
       List<WebElement> e = dropDown.getOptions();
       int itemSize = e.size();
       System.out.println(itemSize);
       */
       
       //<<---------- FOR CHECK BOX ------------------>>
       //no unselect option in raiobutton, in checkbox there is unselect option.
       //driver.findElement(By.id("html/body/input[2]")).click();
       //and so on.
       
       //<<---------- FOR HTML TABLE/WEB TABLE ------------------>>
//       WebElement htmlTable = driver.findElement(By.id("students"));
//       List<WebElement> rows = htmlTable.findElements(By.tagName("tr")); //for rows.
//       int size = rows.size();
//       List<WebElement> columns = htmlTable.findElements(By.tagName("td")); // for columns

        //<<---------- FOR INLINE ELEMENTS ------------------>>
//       driver.get("http://www.google.com");
//       driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
//       driver.navigate().back();
       
       
    }
    
}
