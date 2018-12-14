package com.origin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.origin.utilities.Driver;

public class OriginHomePage {
	private WebDriver driver;
	
	public OriginHomePage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='About Great Game Guarantee']")
	public WebElement aboutLink;
	
	@FindBy(xpath="//h2[@class='otktitle-2']")
	public WebElement header;
	
	
	public boolean titleDisplayed() {
		return driver.getTitle().equals("Origin");
		}
	
}
