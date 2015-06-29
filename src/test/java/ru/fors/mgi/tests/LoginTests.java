package ru.fors.mgi.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

	@Test
	public void userLoginAsInsp(){
		loginpage.userLoginAs(CAO_MGI_INSP);
		Assert.assertTrue(mainpage.isLoggedInAs(CAO_MGI_INSP));
		mainpage.logout();
	}
}
