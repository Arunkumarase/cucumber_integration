package com.arunlab.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the user is on the login page")
    public void userIsOnTheLoginPage(){
        System.out.println("User is on the Login page!!");
    }
    @When("the user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters a valid username and password");
    }
    @Then("the user should be logged in")
    public void theUserShouldBeLoggedIn() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be logged in");
    }
    @When("the user enters a invalid username and password")
    public void theUserEntersAnInvalidUserNameAndPassword(){
        System.out.println("user enters an invalid username and password");
    }
    @Then("the user should see an error message")
    public void theUserShouldSeeErrorMessage(){
        System.out.println("User sees an error message");
    }
}
