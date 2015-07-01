package ru.fors.mgi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnyPage extends Page{
	
	private PageManager pages;

	public AnyPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(linkText = "Выход")
	protected WebElement logoutButton;
	
	@FindBy(css = ".user-information span")
	protected WebElement nameOfLoggedUser;
}
