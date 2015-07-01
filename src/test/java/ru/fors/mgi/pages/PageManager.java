package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {
	
	private WebDriver driver;
	public LoginPage loginPage;
	public MainPage mainPage;

	public PageManager(WebDriver driver){
		this.driver = driver;
		loginPage = initElements(new LoginPage(this));
		mainPage = initElements(new MainPage(this));
		
	}

	private <T extends Page>T initElements(T page) {
		PageFactory.initElements(new CustomElementLocatorFactory(driver, 30),  page);
		// TODO Auto-generated method stub
		return page;
	}

}
