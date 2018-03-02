package cucumber.screenplay.beginner.steps

import cucumber.screenplay.beginner.pages.SSOLoginPage
import net.thucydides.core.annotations.Step
import org.openqa.selenium.chrome.ChromeDriver

class LoginSteps {
    SSOLoginPage loginPage


    @Step
    void isOnTheHomePage() {

        System.setProperty("webdriver.chrome.driver", "E:\\Projects-TestTools\\Test-Selenium\\Selenium_Summit_23-1-2561\\TestSummitSelenium\\BrowserDriver\\chromedriver.exe")
        loginPage.setDriver(new ChromeDriver())
        println(loginPage.getDriver())
        loginPage.open()

    }

    @Step
    void enterUsernameAndPassword() {

        loginPage.inputUsernameAndPassword()
        loginPage.findBy("//*[@id='password']").sendKeys("123456789")

    }

    @Step
    void clickLoginButton() {

        loginPage.findBy("//*[@id='loginButton']").click()

    }

    @Step
    void closeWebDriver() {
        loginPage.driver.close()

    }

}
