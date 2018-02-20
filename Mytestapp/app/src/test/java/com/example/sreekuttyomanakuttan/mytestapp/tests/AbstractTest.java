package com.example.sreekuttyomanakuttan.mytestapp.tests;


import com.example.sreekuttyomanakuttan.mytestapp.Util.AmazonApp;
import com.example.sreekuttyomanakuttan.mytestapp.Util.AppiumDriverBuilder;
import com.example.sreekuttyomanakuttan.mytestapp.Util.Device;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.URL;

import io.appium.java_client.AppiumDriver;


/**
 * Created by sreekuttyOmanakuttan on 12-Sep-17.
 */

//@Listeners({TestObjectTestNGTestResultWatcher.class})
public abstract class AbstractTest  {



    //private TestObjectListenerProvider Lprovider=TestObjectListenerProvider.newInstance();


  // public TestObjectTestNGTestResultWatcher resultWatcher=new TestObjectTestNGTestResultWatcher();


   // private AppiumDriverLocalService service;
    //private AppiumServiceBuilder buider;
    //private AppiumDriver appiumDriver;
    protected AppiumDriver appiumDriver;
    protected AmazonApp amzonapp;
    public Device device;
    private String appiumPath="C:\\Program Files (x86)\\Appium";

  //  @BeforeClass
 //   public void StartAppiumServer() throws IOException, InterruptedException {
       // System.out.println("hai i am in before class to start appium");
     /*   CommandLine cmdline=new CommandLine("cmd");
        cmdline.addArgument("/c");
        cmdline.addArgument(appiumPath+"//node.exe");
        cmdline.addArgument(appiumPath+"//node_modules//appium//bin//appium.js");
        cmdline.addArgument("--address");
        cmdline.addArgument("127.0.0.1");
        cmdline.addArgument("-port");
        cmdline.addArgument("4721");
        cmdline.addArgument("--no-reset");
        cmdline.addArgument("--command-timeout");
        cmdline.addArgument("120");
        cmdline.addArgument("--log");
        cmdline.addArgument("E://appiumTestLog//appiumLogs.txt");
        DefaultExecuteResultHandler resultHandler=new DefaultExecuteResultHandler();
        DefaultExecutor executer=new DefaultExecutor();
        executer.setExitValue(1);
        executer.execute(cmdline,resultHandler);
        Thread.sleep(5000);
        */

       /* buider=new AppiumServiceBuilder();
        buider.withIPAddress("127.0.0.1");
        buider.usingPort(4721);

        service=AppiumDriverLocalService.buildService(buider);
        service.start();*/
  //  }

    @Parameters({"Platform","PlatformVersion","devicedet","apiKey", "appPack","appAct","appUrl"})
    @BeforeTest
    public void ConnectToDevice(String Platform,String PlatformVersion,String devicedet,String apiKey,String appPack,String appAct,String appUrl) throws Exception //Device testDevice
    {

     /*   if(testDevice.platform.equals(DeviceDescriptor.OS.ANDROID))
        this.appiumDriver= AppiumDriverBuilder.forAndroid().withApiKey("androisdisplay").withEndpoint(new URL("http://127.0.0.1:4721/wd/hub")).withTestReport("123").build();
        else if(testDevice.platform.equals(DeviceDescriptor.OS.IOS))
        this.appiumDriver=AppiumDriverBuilder.forIOS().withApiKey("iosdisplay").withEndpoint(new URL("http://127.0.0.1:4722/wd/hub")).withTestReport("123").build();
        else
        throw new Exception("platfor different");*/



        if(Platform.equals("Android")) {
            System.out.println("The values of platform"+Platform);
            this.appiumDriver = AppiumDriverBuilder.forAndroid().withApiKey(apiKey).withEndpoint(new URL("http://127.0.0.1:4723/wd/hub")).withTestReport("123").withPlatform(Platform).withPlatformVersion(PlatformVersion).withappPack(appPack).withappAct(appAct).withappDevice(devicedet).build();
        }
        else if(Platform.equals("IOS")) {
            System.out.println("We are in IOS");
            this.appiumDriver = AppiumDriverBuilder.forIOS().withApiKey(apiKey).withEndpoint(new URL("http://127.0.0.1:4721/wd/hub")).withTestReport("123").withPlatform(Platform).withPlatformVersion(PlatformVersion).withappPack(appPack).withappAct(appAct).withappDevice(devicedet).build();

        }
        else {
            throw new Exception("platfor different");
        }



        //resultWatcher.setAppiumDriver(appiumDriver);
        //Lprovider.setDriver(appiumDriver);
        amzonapp=new AmazonApp(appiumDriver);
    }
}
