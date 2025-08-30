package stepdefinition;

import helper.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;

public class LoginStepDef {
    TestContext testContext;
    WebDriver driver;
    LoginPage loginPage;

    public LoginStepDef(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        loginPage =testContext.getPageObjectManager().getAmazonPage();

    }
    @Given("I launch {string} Application")
    public void i_launch_application(String url) {
    loginPage.loginDifferentPage(url);
    }

    @When("I see the home page with title {string}")
    public void iSeeTheHomePageWithTitle(String title) {
        loginPage.getTitle(title);
    }

    @When("I  enter the {string} and {string}")
    public void i_enter_the_and(String Uname, String Pwd) throws InterruptedException {
        loginPage.enterUserNameAndPwd(Uname,Pwd);
        }
    @And("I enter the Login credential {string} and {string}")
    public void iEnterTheLoginCredentialAnd(String Username, String Pwd) {
        loginPage.enterNaukariCredential(Username,Pwd);
    }


    @And("I check the Title")
    public void iCheckTheTitle() {
        loginPage.toCheckTitle();
    }

    @Then("I refresh the browser using javaScript")
    public void iRefreshTheBrowserUsingJavaScript() {
        loginPage.refreshUrlUsingJavaScript();
    }

}

