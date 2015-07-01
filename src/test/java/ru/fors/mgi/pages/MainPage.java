package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ru.fors.mgi.model.User;

public class MainPage extends AnyPage {

	private PageManager pages;
	
	public MainPage(PageManager pages) {
		super(pages);
	}
	
	public void clickLogoutButton(){
		logoutButton.click();
	}
	
	public String getNameOfLoggedUser(){
		return nameOfLoggedUser.getText();
	}

	
	
	
}
