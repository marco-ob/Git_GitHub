package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;

public class MainSteps {


    @Given("User is on Netbanking landing page")
    public void user_is_on_netbanking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user landed on netbanking page");
    }

//    @When("User login into application with {string} and paswword {string}")
//    public void user_login_into_application_with_and_paswword(String username, String password) {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println(username+" and password is "+password);
//    }

    @When("^User login into application with (.+) and paswword (.+)$")
    public void user_login_into_application_with_and_paswword(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username+" and password is "+password);
    }

    @When("User signup into application")
    public void user_signup_into_application(List<String> data) {

        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3 ));
    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on Practice landing page");
        Assert.assertTrue(false);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
    }
    @Then("Card are displayed")
    public void card_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }


    @Given("setup the entries in database")
    public void setupTheEntriesInDatabase() {
        System.out.println("*************");
        System.out.println("setup the entries in database");
    }

    @And("launch the browser from config variables")
    public void launchTheBrowserFromConfigVariables() {

        System.out.println("launch the browser from config variables");
    }

    @And("hit the home page url of banking site")
    public void hitTheHomePageUrlOfBankingSite() {

        System.out.println("hit the home page url of banking site");
    }
}
