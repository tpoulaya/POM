/**
 * 
 */
package stepDefinition;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author tpoulaya
 *
 */
public class LoginPageStep {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account"); //URL
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {		
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title :"+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTtitle) {
		Assert.assertTrue(title.contains(expectedTtitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) {
		loginPage.enterpassword(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		loginPage.clickOnlogin();
	}
}
