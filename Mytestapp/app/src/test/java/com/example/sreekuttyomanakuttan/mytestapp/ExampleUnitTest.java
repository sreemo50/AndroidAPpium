package com.example.sreekuttyomanakuttan.mytestapp;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public  AppiumDriver<WebElement> driver;
   // public String appiumPath="C:\\Program Files (x86)\\Appium\\node_modules";

    @BeforeSuite
    public void StartAppiumServer()
    {

    }

    @BeforeTest
    public void setup() throws MalformedURLException {

        //driver.quit();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("app", "E:\\APKS\\com.flipkart.android-5.5-www.APK4Fun.com.apk");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("deviceName", "Galaxy Grand Prime");
        capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
        capabilities.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");


        driver =new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4721/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void testingFirstTest()
    {
        // driver.findElements(By.className("ImageView")).get(0).click();
        //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void End()
    {
        driver.quit();
    }



}