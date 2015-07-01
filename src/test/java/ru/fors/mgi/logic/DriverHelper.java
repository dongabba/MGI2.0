package ru.fors.mgi.logic;

import org.openqa.selenium.WebDriver;
import ru.fors.mgi.pages.PageManager;

public class DriverHelper {

	protected PageManager pages;
	protected WebDriver driver;
	
	public DriverHelper(WebDriver driver){
		this.driver = driver;
		pages = new PageManager(driver);
	}
}
