package com.example.sreekuttyomanakuttan.mytestapp.Util;

import com.example.sreekuttyomanakuttan.mytestapp.activities.HomeActivity;
import com.example.sreekuttyomanakuttan.mytestapp.activities.ProductActivity;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;

/**
 * Created by sreekuttyOmanakuttan on 12-Sep-17.
 */

public class AmazonApp {

    private final AppiumDriver driver;
    public AmazonApp(AppiumDriver driver)
    {
        this.driver=driver;
    }

    public HomeActivity HomeScreen()
    {
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        return new HomeActivity(driver);

    }

    public ProductActivity ProductScreen()
    {
        return new ProductActivity(driver);

    }
}
