package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;

import ru.fors.mgi.model.User;

public class MainPage extends AnyPage {

	private WebDriver driver;
	
	public MainPage(WebDriver driver) {
		super(driver);
	}
	
	private void clickLogoutButton(){
		logoutButton.click();
	}
	
	public String getNameOfLoggedUser(){
		return nameOfLoggedUser.getText();
	}
	
	private User getLoggedUser(){
		return new User().setName(getNameOfLoggedUser());
	}
	
	public boolean isLoggedInAs(User user) {
		return getLoggedUser().getName().equals(user.getName());
	}
	
	public LoginPage logout(){
		clickLogoutButton();
		return new LoginPage(driver);
	}
	
	
	
}
