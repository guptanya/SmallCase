package Scenario1.SmallCaseDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobjects.HomePageFlipkart;

public class SearchingFlipkart extends base{

	public static void main(String[] args) throws IOException, InterruptedException {
	
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//Getting current URL
			System.out.println("Site Opened: "+driver.getCurrentUrl());
			HomePageFlipkart  hpf= new HomePageFlipkart(driver);
		//Clicking on searchbox	
			/*	hpf.searchbox().click();
		//clicking on another searchbox	
			hpf.searchBox2().click();
		//entering Product name	
			hpf.searchBox2().sendKeys("Samsung m30s 128 gb");			
			hpf.searchBox2().sendKeys(Keys.ENTER);
	
		*/
	}

}
