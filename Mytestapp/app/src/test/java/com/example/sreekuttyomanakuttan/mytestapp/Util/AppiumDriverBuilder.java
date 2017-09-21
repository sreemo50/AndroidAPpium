package com.example.sreekuttyomanakuttan.mytestapp.Util;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.appium.common.TestObjectCapabilities;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

//import static org.testobject.appium.common.TestObjectCapabilities.TESTOBJECT_API_KEY;

/**
 * Created by sreekuttyOmanakuttan on 12-Sep-17.
 */

public abstract class AppiumDriverBuilder<SELF,DRIVER extends AppiumDriver>{
    protected String apiKey;
    protected  String testreportid;
    protected String platform;
    protected  String platformVersion;
    protected String appPack;
    protected  String appAct;
    protected  String device;



    public static AndroidDriverBuilder forAndroid()
    {
        return new AndroidDriverBuilder();
    }




    public static class AndroidDriverBuilder extends  AppiumDriverBuilder<AndroidDriverBuilder,AndroidDriver> {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        public AndroidDriver build()
        {
            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_API_KEY,apiKey);
            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_TEST_REPORT_ID,testreportid);
            capabilities.setCapability("deviceName", device);
            capabilities.setCapability("platformName", platform);
            capabilities.setCapability("platformVersion", platformVersion);
            capabilities.setCapability("appPackage", appPack);
            capabilities.setCapability("appActivity", appAct);

            return new AndroidDriver(endpoint,capabilities);


        }
    }


    public static IOSDriverBuilder forIOS()
    {
        return new IOSDriverBuilder();
    }


    public static class IOSDriverBuilder extends  AppiumDriverBuilder<IOSDriverBuilder,IOSDriver> {

        DesiredCapabilities capabilities=new DesiredCapabilities();
        public IOSDriver build()
        {
            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_API_KEY,apiKey);
            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_TEST_REPORT_ID,testreportid);
            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_DEVICE, device);
            capabilities.setCapability("platformName", platform);
            capabilities.setCapability("platformVersion", platformVersion);
            capabilities.setCapability("appPackage", appPack);
            capabilities.setCapability("appActivity", appAct);


            return new IOSDriver(endpoint,capabilities);


        }
    }
    protected URL endpoint;

    public SELF withEndpoint(URL endpoint)
    {
        this.endpoint=endpoint;
        return (SELF) this;
    }

    public SELF withApiKey(String apikey)
    {
        this.apiKey=apikey;
        return (SELF) this;
    }

    public SELF withTestReport(String testReportId)
    {
        this.testreportid=testReportId;
        return (SELF) this;
    }

    public SELF withPlatformVersion(String platformversion)
    {
        this.platformVersion=platformversion;
        return (SELF) this;
    }

    public SELF withPlatform(String platform)
    {
        this.platform=platform;
        return (SELF) this;
    }
    public SELF withappPack(String appPack)
    {
        this.appPack=appPack;
        return (SELF) this;
    }
    public SELF withappAct(String appAct)
    {
        this.appAct=appAct;
        return (SELF) this;
    }

    public SELF withappDevice(String device)
    {
        this.device=device;
        return (SELF) this;
    }
    public abstract DRIVER build();

}
