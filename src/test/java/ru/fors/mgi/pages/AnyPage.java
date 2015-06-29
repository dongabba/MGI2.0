package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnyPage {
	
	private WebDriver driver;

	public AnyPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(linkText = "Выход")
	protected WebElement logoutButton;
	
	@FindBy(css = ".user-information span")
	protected WebElement nameOfLoggedUser;
}
