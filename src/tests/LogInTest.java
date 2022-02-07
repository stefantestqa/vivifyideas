package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
	@BeforeMethod
	public void name() throws InterruptedException {
		super.driver.navigate().to(webSiteUrl);
		Thread.sleep(1000);
		mainPage.clickOnLogInMenuButton();
		Thread.sleep(1000);
	}
	@Test
	public void logInWithValidCredentials() throws InterruptedException {
		String email = excelReader.returnStringDataFromExcel("log in", 6, 2);
		String password = excelReader.returnStringDataFromExcel("log in", 7, 2);
		String expectedText = excelReader.returnStringDataFromExcel("log in", 11, 3);
		String actualText;
		
		logInPage.insertEmail(email);
		logInPage.insertPassword(password);
		logInPage.clickOnSubmitButton();
		actualText = mainPage.getAllGalleriesMessageText();
		assertEquals(actualText, expectedText);
		
	}
	@Test
	public void logInInvalidCredentials() throws InterruptedException {
		String email = excelReader.returnStringDataFromExcel("log in", 18, 2);
		String password = excelReader.returnStringDataFromExcel("log in", 19, 2);
		String expectedText = excelReader.returnStringDataFromExcel("log in", 22, 3);
		String actualText;
		
		logInPage.insertEmail(email);
		logInPage.insertPassword(password);
		logInPage.clickOnSubmitButton();
		
		actualText = logInPage.getAlertMessageText();
		assertEquals(actualText, expectedText);
	}

}
