/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_object_model;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.monte.media.Format;
import org.monte.media.FormatKeys;
import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

/**
 *
 * @author avidekar
 */
public class PercentCalculator {
    
    private static WebDriver driver = null;
    private static ScreenRecorder screenRecorder;
    
    public static void main(String[] args) throws IOException, AWTException{
        GraphicsConfiguration gconfig = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        screenRecorder = new ScreenRecorder(gconfig, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI), new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, (int)24, FrameRateKey, Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, (int) (15 * 60)), new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,"black", FrameRateKey, Rational.valueOf(30)), null);
        driver = new FirefoxDriver();
        screenRecorder.start();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.calculator.net");
        PageObjectPercCalc.mathCalculatorLink(driver).click();
        PageObjectPercCalc.percentageCalculatorLink(driver).click();
        
        PageObjectPercCalc.textBox1(driver).clear();
        PageObjectPercCalc.textBox1(driver).sendKeys("10");
        
        PageObjectPercCalc.textBox2(driver).clear();
        PageObjectPercCalc.textBox2(driver).sendKeys("50");
        
        PageObjectPercCalc.calculate(driver).click();
        String result = PageObjectPercCalc.result(driver).getText();
        System.out.print(result); 
        driver.close();
        screenRecorder.stop();
    }
    
}
