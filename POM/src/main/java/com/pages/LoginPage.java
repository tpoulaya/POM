/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author 155812
 *
 */
public class LoginPage {
	private WebDriver driver;
	
	//1. By Locators
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By submitButton = By.id("SubmitLogin");
	private By forgotPasswordLink = By.xpath("(//div/p/a)[2]");
	
	//2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. Page actions : features (behavior) of the page  the form of methods.
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPasswordLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnlogin() {
		driver.findElement(submitButton).click();
	}
	
	public AccountsPage doLogin(String uName, String uPassword) {
		driver.findElement(emailId).sendKeys(uName);
		driver.findElement(password).sendKeys(uPassword);
		driver.findElement(submitButton).click();
		return new AccountsPage(driver);
	}
}
