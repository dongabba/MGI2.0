package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.fors.mgi.model.User;

public class LoginPage extends AnyPage{

	private WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(name = "username")
	private WebElement usernameField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(css = "input[type=\"submit\"]")
	private WebElement submitButton;

	private LoginPage setUsernameField(String username){
		usernameField.clear();
		usernameField.sendKeys(username);
		return this;
	}
	
	private LoginPage setPasswordField(String password){
		passwordField.clear();
		passwordField.sendKeys(password);
		return this;
	}
	
	private void clickSubmitButton(){
		submitButton.click();
	}
	
	public MainPage userLoginAs(User user){
		setUsernameField(user.getLogin());
		setPasswordField(user.getPassword());
		clickSubmitButton();
		return new MainPage(driver);
	}

}
