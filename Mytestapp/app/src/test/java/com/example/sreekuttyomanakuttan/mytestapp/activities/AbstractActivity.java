package com.example.sreekuttyomanakuttan.mytestapp.activities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.HideKeyboardStrategy;

/**
 * Created by sreekuttyOmanakuttan on 16-Sep-17.
 */

public abstract class AbstractActivity  {

    public AppiumDriver driver;
    public AbstractActivity(AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    //whether the driver is android
    public boolean isAndroid()
    {
        return driver instanceof AndroidDriver;
    }

    //whether the driver is IOS
    public boolean isIOS()
    {
        return driver instanceof IOSDriver;
    }


    //to hide the key board or android or ios based on active instance of driver
    public  void hideKeyboard()
    {
        if(isAndroid())
        {
            driver.hideKeyboard();

        }
        else
        {
            IOSDriver iosdriver=(IOSDriver) driver;
            iosdriver.hideKeyboard(HideKeyboardStrategy.PRESS_KEY,"Done");
        }
    }

    //finding elements which takes some time to appear on screen
    public MobileElement findElementwithtime(By tby, int timelimit)
    {
        return (MobileElement) (new WebDriverWait(driver,timelimit)).until(ExpectedConditions.presenceOfElementLocated(tby));
    }


    //get the desplied allert details using the above method
    public String getAlertTitle()
    {
        if(isIOS())
        {
            return findElementwithtime(By.xpath("//UIAAlert/UIAScrollView/UIStaticText[1]"),10).getText();
        }
        else
        {
            return findElementwithtime(By.id("android:id/alertTitle"),10).getText();

        }

    }
}
