package stepdefinition;


import io.cucumber.junit.Cucumber;


import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    System.out.println("on the landing page");
    	throw new PendingException();
    }

   /* @When("^when user login to the application using username and password$")
    public void when_user_login_to_the_application_using_username_and_password() throws Throwable {
       System.out.println("loggedin");
    	throw new PendingException();*/
    	

        @When("^when user login to the application using \"([^\"]*)\" and \"([^\"]*)\"$")
        public void when_user_login_to_the_application_using_something_and_something(String strArg1, String strArg2) throws Throwable {
           
        	System.out.println(strArg1);
        	System.out.println(strArg2);
        	throw new PendingException();
    }

    @Then("^ then home page is displayed$")
    public void then_home_page_is_displayed() throws Throwable {
        throw new PendingException();
    }

  /*  @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        throw new PendingException();
}*/
        
    
    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
        
    }

