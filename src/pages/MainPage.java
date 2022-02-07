package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement logInMenuButton;
	WebElement registerMenuButton;
	WebElement allGalleriesMenuButton;
	WebElement myGalleriesMenuButton;
	WebElement createGalleryMenuButton;
	WebElement allGalleriesMessage;
	WebElement logOutButton;
	
	
	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getLogInMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]/a"));
	}


	public WebElement getRegisterMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[2]/a"));
	}

	public WebElement getAllGalleriesMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[1]/a"));
	}

	public WebElement getMyGalleriesMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[2]/a"));
	}


	public WebElement getCreateGalleryMenuButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[1]/li[3]/a"));
	}
	
	public WebElement getAllGalleriesMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/h1"));
	}
	
	public WebElement getLogOutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]/a"));
	}

	public void clickOnLogInMenuButton() throws InterruptedException {
		this.getLogInMenuButton().click();
		Thread.sleep(1000);
	}

	public void clickOnRegisterMenuButton() throws InterruptedException {
		this.getRegisterMenuButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnAllGalleriesMenuButton() throws InterruptedException {
		this.getAllGalleriesMenuButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnMyGalleriesMenuButton() throws InterruptedException {
		this.getMyGalleriesMenuButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnCreateGalleryMenuButton() throws InterruptedException {
		this.getCreateGalleryMenuButton().click();
		Thread.sleep(1000);
	}
	
	public String getAllGalleriesMessageText() {
		return this.getAllGalleriesMessage().getText();
	}
	
	public void clickOnLogOutButton() throws InterruptedException {
		this.getLogOutButton().click();
		Thread.sleep(1000);
	}
}
