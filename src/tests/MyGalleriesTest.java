package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyGalleriesTest extends BaseTest {
	@BeforeMethod
	 public void name() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
	}
	@Test
	public void findMyCreatedGallery() throws InterruptedException {
		String searchForGallery = excelReader.returnStringDataFromExcel("my gallery page", 7, 2);
		String expectedText = excelReader.returnStringDataFromExcel("my gallery page", 11, 3);
		String actualText;
		
		mainPage.clickOnLogInMenuButton();
		super.logInValidCredentials();
		mainPage.clickOnMyGalleriesMenuButton();
		myGaleriesPage.getSearchInputField().sendKeys(searchForGallery);
		myGaleriesPage.clickOnFilterButton();
		actualText = myGaleriesPage.getautohorNameText();
		assertEquals(actualText, expectedText);
		
	}
}
