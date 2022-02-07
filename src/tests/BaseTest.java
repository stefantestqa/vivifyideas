package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CreateGalleryPage;
import pages.LogInPage;
import pages.MainPage;
import pages.MyGalleriesPage;

public class BaseTest {
	WebDriver driver;
	LogInPage logInPage;
	MainPage mainPage;
	CreateGalleryPage createGalleryPage;
	MyGalleriesPage myGaleriesPage;
	ExcelReader excelReader;
	String webSiteUrl;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		excelReader = new ExcelReader(new File("data/VivifyGalleriesTestPlan.xlsx"));
		mainPage = new MainPage(driver);
		logInPage = new LogInPage(driver);
		createGalleryPage = new CreateGalleryPage(driver);
		myGaleriesPage = new MyGalleriesPage(driver);
		driver.manage().window().maximize();
		webSiteUrl = excelReader.returnStringDataFromExcel("log in", 4, 2);
	}
	
	@AfterClass
	public void afterClass() {
		this.driver.close();
	}
	
	public void logInValidCredentials() throws InterruptedException {
		String email = excelReader.returnStringDataFromExcel("log in", 6, 2);
		String password = excelReader.returnStringDataFromExcel("log in", 7, 2);

		logInPage.insertEmail(email);
		logInPage.insertPassword(password);
		logInPage.clickOnSubmitButton();
	}
}
