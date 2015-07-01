package ru.fors.mgi.logic;

import org.openqa.selenium.WebDriver;

import ru.fors.mgi.model.User;
import ru.fors.mgi.pages.LoginPage;
import ru.fors.mgi.pages.MainPage;

public class UserAction extends DriverHelper{
	private WebDriver driver;
	
	public UserAction(WebDriver driver){
		super(driver);
	}



	public MainPage userLoginAs(User user) {
		pages.loginPage
			.setUsernameField(user.getLogin())
			.setPasswordField(user.getPassword())
			.clickSubmitButton();
		return pages.mainPage;
	}

	public boolean isUserLoggedAs(User user) {
		return pages.mainPage.getNameOfLoggedUser().equals(user.getName());
	}
	
	public LoginPage logout(){
		pages.mainPage.clickLogoutButton();
		return pages.loginPage;
	}

}
