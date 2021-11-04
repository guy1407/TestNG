package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class BaseClass {

    @BeforeTest
    public void setup() {

        System.out.println("Inside setup!");

        DesiredCapabilities caps = null;

        try {
            caps = new DesiredCapabilities();


            caps.setCapability("deviceName", "SM-N960F");
            //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-N960F");


            //caps.setCapability("udid", "288979af33027ece");
            caps.setCapability("udid", "192.168.1.81:5555");
            //caps.setCapability(MobileCapabilityType.UDID, "288979af33027ece");

            /*
            caps.setCapability("platformName", "Android");
            caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            */

            caps.setCapability("platformName", "Android");

            caps.setCapability("platformVersion", "10");
            //caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");


            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60); //60 sec

            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            //caps.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.DEFAULT);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, caps);

        } catch (Exception ex) {
            System.out.println("Cause = " + ex.getCause());
            System.out.println("Message = " + ex.getMessage());
            ex.printStackTrace();
        }


        /***************************/

        //caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");

        //caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

    }//setup


    @AfterTest
    public void teardown() {
        System.out.println("Inside teardown!");
    }//teardown

    @Test
    public void sampleTest() {
        System.out.println("Inside sample test!");
    }//sampleTest

}//BaseClass
