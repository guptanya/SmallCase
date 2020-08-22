package Scenario2.SmallCaseDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import Scenario1.SmallCaseDemo.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjects.HomePageAmazon;

public class SearchingAmazon extends base{

	public static void main(String[] args) throws IOException, InterruptedException {
AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//Getting current URL
			System.out.println("Site Opened: "+driver.getCurrentUrl());
		HomePageAmazon hpa= new HomePageAmazon(driver);
		//Clicking on searchbox	
/*		hpa.searchbox().click();
		//entering Product name	
		hpa.searchbox().sendKeys("Samsung m30s 128 gb");
		hpa.searchButton().click();
	*/
		
	}

	

}
