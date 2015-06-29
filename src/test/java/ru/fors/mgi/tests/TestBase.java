package ru.fors.mgi.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import ru.fors.mgi.model.User;
import ru.fors.mgi.pages.AnyPage;
import ru.fors.mgi.pages.LoginPage;
import ru.fors.mgi.pages.MainPage;
import ru.fors.mgi.utils.Browser;
import ru.fors.mgi.utils.PropertyLoader;
import ru.fors.mgi.utils.WebDriverFactory;

public class TestBase {
	
	public static User CAO_MGI_INSP = new User().setLogin("cao_mgi_insp").setPassword("cao_mgi_insp").setName("Бехтер С. В.");
	public static User CAO_MGI_BOSS = new User().setLogin("cao_mgi_boss").setPassword("cao_mgi_boss").setName("Качалов А. С.");
	public static User CAO_MGI_EMPLOYEE = new User().setLogin("cao_mgi_employee").setPassword("cao_mgi_employee").setName("Мирошникова С. Ф.");
	
	protected WebDriver driver;
	
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
	AnyPage anypage = PageFactory.initElements(driver, AnyPage.class);
	
	protected String baseUrl;
	protected Browser browser;
	
	
	@BeforeClass
    public void init() {
            baseUrl = PropertyLoader.loadProperty("site.url");
            
            browser = new Browser();
            browser.setName(PropertyLoader.loadProperty("browser.name"));
                        
            driver = WebDriverFactory.getInstance(browser);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(baseUrl);
            
      
    }

   /* @AfterSuite(alwaysRun = true)
    public void tearDown() {
            if (driver != null) {
                    driver.quit();
            }
    }
    */
}
