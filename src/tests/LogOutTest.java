package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {
	@BeforeMethod
	public void name() throws InterruptedException {
		super.driver.navigate().to(webSiteUrl);
		Thread.sleep(1000);
		mainPage.clickOnLogInMenuButton();
		Thread.sleep(1000);
	}
	@Test
	public void logOut() throws InterruptedException {
		String expectedText = excelReader.returnStringDataFromExcel("logout", 7, 3 );
		String actualText;
		
		mainPage.clickOnLogInMenuButton();
		super.logInValidCredentials();
		mainPage.clickOnLogOutButton();
		actualText = logInPage.getlogInMessageText();
		assertEquals(actualText, expectedText);
	}
	
}	