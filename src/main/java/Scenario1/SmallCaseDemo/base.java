package Scenario1.SmallCaseDemo;
import java.io.IOException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {
	  public static AppiumDriverLocalService service;
	  public static AndroidDriver<AndroidElement>  driver;
	  
	



	public static  AndroidDriver<AndroidElement> capabilities() throws IOException, InterruptedException
	{
	
     DesiredCapabilities capabilities = new DesiredCapabilities();
 

	  Thread.sleep(6000);
  
  
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo1");
     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
     
    
    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
	
	 
	    return driver;
	}
	

}
