package Stepsdef;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KB_Stepsdef {
	@Given("Landed on the KB System Login Page")
	public void landed_on_the_kb_system_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Landed on the KB System Login Page");
	}
	@Given("Landed on the Practice Login Page")
	public void landed_on_the_practice_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Landed on the Practice Login Page");
	}
	// Using Regex Pattern for all type of inputs.
//	@When("^User Login in the KB-System using username (.+) and password (.+)$")
//	public void user_login_in_the_kb_system_using_and(String username, String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Username "+username+ " Password = "+password);
//	}
	@When("User Login in the KB-System using username {string} and password {string}")
	public void user_login_in_the_kb_system_using_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Username "+username+ " Password = "+password);
	}
	
	@When("User Login in the Practice login page")
	public void user_login_in_the_practice_login_page(List<String> data) {
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    
	    
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Dashboard is visible")
	public void dashboard_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dashboard is visible");
	}
	@Given("setup the entries of the database")
	public void setupdatabase() {
		System.out.print("-----------");
		System.out.println("Database setted");
	}
	
	@When("Launch the browser")
	public void launchbrowser() {
		System.out.println("Browser Launched");
	
	}
	@Then("Hit the database")
	public void Hitdatabase() {
		System.out.println("Database has been Hit");
	}

	

}
