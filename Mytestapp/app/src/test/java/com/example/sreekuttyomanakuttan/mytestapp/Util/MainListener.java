package com.example.sreekuttyomanakuttan.mytestapp.Util;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.remote.strprotocol.IRemoteTestListener;
import org.testng.remote.strprotocol.TestMessage;
import org.testng.remote.strprotocol.TestResultMessage;

/**
 * Created by sreekuttyOmanakuttan on 15-Sep-17.
 */

public class MainListener implements ITestListener,IRemoteTestListener,ISuiteListener {
    //private AppiumDriverLocalService service;
   // private AppiumServiceBuilder buider;
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("I am in onTestStart "+ result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I am in onTestSuccess "+ result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I am in onTestFailure "+ result.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("I am in onTestSkipped "+ result.getTestName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("I am in onTestFailedButWithinSuccessPercentage "+ result.getTestName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("I am in context onStart "+ context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("I am in context  onFinish "+ context.getName());
    }

    @Override
    public void onStart(ISuite suite) {

        System.out.println("I am in suite onStart "+ suite.getName());
      //  buider=new AppiumServiceBuilder();
    //   buider.withIPAddress("127.0.0.1");
       // buider.usingPort(4721);

        //service= AppiumDriverLocalService.buildService(buider);
       // service.start();
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("I am in suite onFinish "+ suite.getName());
    }

    @Override
    public void onStart(TestMessage tm) {
        System.out.println("I am in Remotelistener onStart "+ tm.getTestName());
    }

    @Override
    public void onFinish(TestMessage tm) {
        System.out.println("I am in Remotelistener onFinish "+ tm.getTestName());
    }

    @Override
    public void onTestStart(TestResultMessage trm) {
        System.out.println("I am in Remotelistener onTestStart"+ trm.getName());
    }

    @Override
    public void onTestSuccess(TestResultMessage trm) {
        System.out.println("I am in Remotelistener onTestSuccess "+ trm.getName());
    }

    @Override
    public void onTestFailure(TestResultMessage trm) {
        System.out.println("I am in Remotelistener onTestFailure "+ trm.getName());
    }

    @Override
    public void onTestSkipped(TestResultMessage trm) {
        System.out.println("I am in Remotelistener onTestSkipped "+ trm.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(TestResultMessage trm) {
        System.out.println("I am in Remotelistener onTestFailedButWithinSuccessPercentage "+ trm.getName());
    }
}
