package cucumber.screenplay.beginner.pages

import net.serenitybdd.core.pages.PageObject
import net.serenitybdd.core.pages.WebElementFacade
import net.thucydides.core.annotations.DefaultUrl

@DefaultUrl("http://excoss.localdomain:7777/sta-oss-e/service/index.xhtml")
class SSOLoginPage extends PageObject{
    WebElementFacade username

    void inputUsernameAndPassword(){
        username.findBy("//*[@id='username']").sendKeys("thanathep@summitthai.com")
    }
}
