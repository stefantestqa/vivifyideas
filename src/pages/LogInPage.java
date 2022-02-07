package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	WebDriver driver;
	WebElement emailInputField;
	WebElement passwordInputField;
	WebElement submitButton;
	WebElement logInMessage;
	WebElement alertMessage;
	
	
	
	public LogInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement getEmailInputField() {
		return this.driver.findElement(By.id("email"));
	}



	public WebElement getPasswordInputField() {
		return this.driver.findElement(By.id("password"));
	}



	public WebElement getsubmitButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/button"));
	}
	
	
	
	public WebElement getLogInMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/h1"));
	}

	

	public WebElement getAlertMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/p"));
	}



	public void insertEmail(String email) throws InterruptedException {
		this.getEmailInputField().sendKeys(email);
		Thread.sleep(1000);
	}
	
	public void insertPassword(String password) throws InterruptedException {
		this.getPasswordInputField().sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickOnSubmitButton() throws InterruptedException {
		this.getsubmitButton().click();
		Thread.sleep(1000);
	}
	
	public String getlogInMessageText() {
		return this.getLogInMessage().getText();
	}
	
	public String getAlertMessageText() {
		return this.getAlertMessage().getText();
	}
}