//For Amazon.in

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePageFlipkart {

	public HomePageFlipkart(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"#search\"]/android.view.View")
	private WebElement searchfield;
	
	
	public WebElement searchbox()
	{
		return searchfield;
	}
	
	@AndroidFindBy(xpath="//*[contains(@resource-id,'input-search')]")
	private WebElement searchbox2;
	
	
	public WebElement searchBox2()
	{
		return searchbox2;
	}
	
	
	
}
