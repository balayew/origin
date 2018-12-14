package com.origin.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.origin.pages.OriginHomePage;
import com.origin.utilities.TestBaseClass;

public class HomePageTest2 extends TestBaseClass {
	OriginHomePage hp = new OriginHomePage();
	
	@Test(priority=0, groups= "smoke")
	public void validateHomePage() {
		System.out.println("2nd test in smoke " + hp.titleDisplayed());
		assertTrue(hp.titleDisplayed());
		
	}
	
	@Test (priority=0, groups= "smoke")
	public void validateLink() {
		System.out.println("3rd test in smoke " + hp.header.getText());
		//System.out.println(hp.aboutLink.getText());
		//assertEquals(hp.header.getText(), "Trending");
		
	}

}
