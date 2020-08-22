//For Amazon.in

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePageAmazon {

	public HomePageAmazon(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@resource-id='nav-search-keywords']")
	private WebElement searchfield;
	
	
	public WebElement searchbox()
	{
		return searchfield;
	}
	
	@AndroidFindBy(xpath="//*[@text='Go']")
	private WebElement searchbox;
	
	
	public WebElement searchButton()
	{
		return searchbox;
	}
	
	
	
}
