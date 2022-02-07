package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyGalleriesPage {
	WebDriver driver;
	WebElement searchInputField;
	WebElement filterButton;
	WebElement authorName;
	
	public MyGalleriesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSearchInputField() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/input"));
	}

	public WebElement getFilterButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/div/button"));
	}

	public WebElement getAuthorName() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/p/a"));
	}
	
	public void insertSearchTerm(String term) throws InterruptedException {
		this.getSearchInputField().sendKeys(term);
		Thread.sleep(1000);
	}
	
	public void clickOnFilterButton() throws InterruptedException {
		this.getFilterButton().click();
		Thread.sleep(1000);
	}
	
	public String getautohorNameText() {
		return this.getAuthorName().getText();
	}
}
