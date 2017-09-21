package com.example.sreekuttyomanakuttan.mytestapp.Util;

import com.example.sreekuttyomanakuttan.mytestapp.activities.HomeActivity;
import com.example.sreekuttyomanakuttan.mytestapp.activities.ProductActivity;

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
        return new HomeActivity(driver);

    }

    public ProductActivity ProductScreen()
    {
        return new ProductActivity(driver);

    }
}
