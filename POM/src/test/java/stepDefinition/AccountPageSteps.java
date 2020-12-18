/**
 * 
 */
package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * @author tpoulaya
 *
 */
public class AccountPageSteps {
	
	private LoginPage lPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountPage;
	
	@Given("user has already logged in to the application")
	public void user_has_already_logged_in_to_the_application(DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountPage = lPage.doLogin(username, password);
	}

	@Given("user is on the account page")
	public void user_is_on_the_account_page() {
		accountPage.getAccountPageTitle();
	}

	@Then("user gets account section")
	public void user_gets_account_section(DataTable sectionsTable) {
		List<String> listOfaccountSectionList = sectionsTable.asList();
		System.out.println("Expected accounts section list :"+listOfaccountSectionList);
		List<String> actualSectionList = accountPage.getAccountsSectionList();
		System.out.println("Actual accoutns section list :"+actualSectionList);
		
		Assert.assertTrue(listOfaccountSectionList.containsAll(actualSectionList));
	}

	@Then("account section count should be {int}")
	public void account_section_count_should_be(Integer int1) {
		Assert.assertTrue(accountPage.getAccountSectionCount() == int1); 
	}
}
