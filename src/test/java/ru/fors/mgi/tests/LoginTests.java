package ru.fors.mgi.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

	@Test
	public void userLoginAsInsp(){
		userAction.userLoginAs(CAO_MGI_INSP);
		Assert.assertTrue(userAction.isUserLoggedAs(CAO_MGI_INSP));
		userAction.logout();
	}
}
