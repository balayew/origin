package com.origin.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.origin.pages.OriginHomePage;
import com.origin.utilities.TestBaseClass;

public class HomePageTest extends TestBaseClass {
	OriginHomePage hp = new OriginHomePage();
	
	@Test(priority=0, groups= {"smoke"})
	public void validateHomePage() {
		System.out.println("First test in smoke "+ hp.titleDisplayed() );
		assertTrue(hp.titleDisplayed());
		
	}
	
	@Test (priority=0, groups= {"regression"})
	public void validateLink() {
		System.out.println("1st test in regression "+hp.header.getText());
		//System.out.println(hp.aboutLink.getText());
		//assertEquals(hp.header.getText(), "Trending");
		
	}

}
