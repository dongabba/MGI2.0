package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ru.fors.mgi.model.User;

public class LoginPage extends AnyPage{

	private PageManager pages;
	
	public LoginPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(name = "username")
	private WebElement usernameField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(css = "input[type=\"submit\"]")
	private WebElement submitButton;

	public LoginPage setUsernameField(String username){
		usernameField.clear();
		usernameField.sendKeys(username);
		return this;
	}
	
	public LoginPage setPasswordField(String password){
		passwordField.clear();
		passwordField.sendKeys(password);
		return this;
	}
	
	public void clickSubmitButton(){
		submitButton.click();
	}
	

}
