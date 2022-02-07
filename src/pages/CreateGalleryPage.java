package pages;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateGalleryPage {
	WebDriver driver;
	WebElement titleInputField;
	WebElement descriptionsInputField;
	WebElement imageUrlInputField;
	WebElement submitButton;
	WebElement cancelButton;
	
	public CreateGalleryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getTitleInputField() {
		return this.driver.findElement(By.id("title"));
	}

	public WebElement getDescriptionsInputField() {
		return this.driver.findElement(By.id("description"));
	}

	public WebElement getImageUrlInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/div/div/input"));
	}

	public WebElement getSubmitButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[1]"));
	}

	public WebElement getCancelButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/button[2]"));
	}
	
	public void insertTitle(String title) throws InterruptedException {
		this.getTitleInputField().sendKeys(title);
		Thread.sleep(1000);
	}
	
	public void insertDescription(String description) throws InterruptedException {
		this.getDescriptionsInputField().sendKeys(description);
		Thread.sleep(1000);
	}
	public void insertImageUrl(String imageUrl) throws InterruptedException {
		this.getImageUrlInputField().sendKeys(imageUrl);
		Thread.sleep(1000);
	}
	
	public void clickOnSubmitButton() throws InterruptedException {
		this.getSubmitButton().click();
		Thread.sleep(1000);
	}
	public void clickOnCancelButton() throws InterruptedException {
		this.getCancelButton().click();
		Thread.sleep(1000);
	}
}
