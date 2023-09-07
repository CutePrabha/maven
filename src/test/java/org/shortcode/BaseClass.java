package org.shortcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public  static WebDriver driver;
	public  static Actions a;
	
	
	
	
	
	
	
	
	private void ChromeBrowser()
	{
		driver = new ChromeDriver();

	}
	private void EdgeBrowser()
	{
		driver = new EdgeDriver();	
	}
	private void FirefoxBrowser() 
	{
		driver = new FirefoxDriver();	
	}
	private void maxWindow() 
	{
		driver.manage().window().maximize();

	}
	private void getTitle() 
	{
     String title = driver.getTitle();
     System.out.println("Page Title:"+title);
     
	}
	private void getCurrentPageUrl() 
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current page url:"+currentUrl);
	}
	private void closeBrowser() {
		driver.close();
	}
	private void buttonToBeClick(WebElement NK) {
		NK.click();
	}
	private void getTheText(WebElement PL) {
		String text = PL.getText();
		System.out.println(text);
	}
	private void getAttribute(WebElement PT,String value) {
         String attribute = PT.getAttribute(value);
         System.out.println(attribute);
	}
	private void ClickTheElement(WebElement element) {
		element.click();
	}
	private void PassTheValue(WebElement HG,String keys) {
		HG.sendKeys(keys);
	}
	
	private void moveToElement(WebElement target) {
	  a = new Actions(driver);
	  a.moveToElement(target).perform();
	}
	private void DragAndDroup(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





