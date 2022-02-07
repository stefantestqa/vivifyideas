package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateGalleryTest extends BaseTest {
	
	@BeforeMethod
	 public void name() throws InterruptedException {
		super.driver.navigate().to(super.webSiteUrl);
		Thread.sleep(1000);
	}
	@Test
	public void createGallery() throws InterruptedException {
		String title = excelReader.returnStringDataFromExcel("create gallery", 6, 2);
		String description = excelReader.returnStringDataFromExcel("create gallery", 7, 2);
		String imageUrl = excelReader.returnStringDataFromExcel("create gallery", 8, 2);
		
		
		mainPage.clickOnLogInMenuButton();
		super.logInValidCredentials();
		mainPage.clickOnCreateGalleryMenuButton();
		createGalleryPage.getTitleInputField().sendKeys(title);
		createGalleryPage.getDescriptionsInputField().sendKeys(description);
		createGalleryPage.getImageUrlInputField().sendKeys(imageUrl);
		createGalleryPage.clickOnSubmitButton();
	}
	
}