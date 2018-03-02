package cucumber.screenplay.beginner.scenario

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.screenplay.beginner.steps.LoginSteps
import net.thucydides.core.annotations.Steps

class ScenarioSteps {

    @Steps
    LoginSteps loginStepTest

    @Given("I navigate to SSO login page")
    void navigateToLoginPage(){
        loginStepTest.isOnTheHomePage()

    }
    @When("I enter the username and password")
    void enterUsernameAndPassword(){
        loginStepTest.enterUsernameAndPassword()

    }
    @When("I click login button")
    void clickLoginButton(){
        loginStepTest.clickLoginButton()
    }

    @Then("I should see error message alert from page")
    void errorMessageAlert(){
        println("Successfully")
    }

    @And("I close web browser")
    void closeBrowser(){
        loginStepTest.closeWebDriver()
    }
}
