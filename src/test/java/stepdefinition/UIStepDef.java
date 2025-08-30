package stepdefinition;

import helper.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import pageobject.UIPage;

import java.io.IOException;
public class UIStepDef {
    TestContext testContext;
    WebDriver driver;
    UIPage uiPage;

    public UIStepDef(TestContext context){
        testContext=context;
        driver=testContext.getWebDriverManager().getDriver();
        uiPage=testContext.getPageObjectManager().getUiPage();

    }
    @When("I scroll down the bottom page")
    public void i_scroll_down_the_bottom_page() throws InterruptedException {
        uiPage.fullScrollMethod();
    }

    @And("i open the new Tab using different Method")
    public void iOpenTheNewTabUsingDifferentMethod() throws InterruptedException {
        uiPage.openNewTab();
    }
    @And("i open the new Window using different Method")
    public void iOpenTheNewWindowUsingDifferentMethod() throws InterruptedException {
        uiPage.openNewWindow();
    }

    @Given("I Close The Browser")
    public void i_close_the_browser() {
        uiPage.closeTheBrowserUsingDifferentMethod();
    }

    @And("I change the Position of browser")
    public void iChangeThePositionOfBrowser() {
        uiPage.changeBrowserPosition();
    }

    @And("I change the Size of browser")
    public void iChangeTheSizeOfBrowser() {
        uiPage.changeBrowserSize();
    }

    @And("I verify the Text using assert equal using String operation")
    public void iVerifyTheTextUsingAssertEqualUsingStringOperation() {
        uiPage.verifyText();
    }
    @Then("I verify Best Seller Text")
    public void iVerifyBestSellerText() {
        uiPage.textVerifed();
    }

    @Then("I verify the {string} text on homePage")
    public void iVerifyTheTextOnHomePage(String text) {
        uiPage.verifyTextName(text);
    }

    @And("I verify fresh element is displayed on homepage")
    public void iVerifyFreshElementIsDisplayedOnHomepage() {
        uiPage.verifyIsDisplayed();
    }

    @Then("I verify that the and order link is enabled or not")
    public void iVerifyThatTheAndOrderLinkIsEnabledOrNot() {
        uiPage.verifyIsEnabled();
    }

    @Then("I findOut the number of link in a page")
    public void iFindOutTheNumberOfLinkInAPage() {
        uiPage.findOutLink();
    }

    @Then("I take a screenshot on homepage")
    public void iTakeAScreenshotOnHomepage() throws IOException {
        uiPage.TakeScreenshotMethod();
    }

    @Then("I mouseHover on {string} Method")
    public void iMouseHoverOnMethod(String move)  {
        uiPage.sikuliMouseMovement(move);
    }

    @And("I click on {string} Button under the Black frame")
    public void iClickOnButtonUnderTheBlackFrame(String subTab) {
        switch (subTab){
            case "sell":
                uiPage.clickSellTab();
                break;
            case "mobile":
                uiPage.clickMobileTab();
                break;
            default:
                System.out.println("No options available");
        }
    }

    @And("I click on {string} Button")
    public void iClickOnButton(String tab) {
        uiPage.clickTab(tab);

    }

    @And("I click on {string} under {string} Button")
    public void iClickOnUnderButton(String subButton, String Button) {
        switch (Button){
            case "Trending":
                uiPage.subTabButton(subButton);
                break;
            default:
                System.out.println("No options available");
        }
    }

    @And("I click on All Button")
    public void iClickOnAllButton() {
        uiPage.clickAllButtonTab();
    }

    @And("I verify the {string} text is present in amazon UI verify Not Equal Operator")
    public void iVerifyTheTextIsPresentInAmazonUIverifyNotEqualOperator(String text) {
        uiPage.verifyNotEqualOperator(text);
    }


    @And("I select the {string} form the amazon UI")
    public void iSelectTheFormTheAmazonUI(String value) throws InterruptedException {
        uiPage.selectClass(value);
    }

    @And("I select {string} from the Dropdown option dropdown")
    public void iSelectFromTheDropdownOptionDropdown(String value) throws InterruptedException {
        uiPage.usingtabledatacode(value);
    }

    @And("I click on Electronic button to verify is highlighted")
    public void iClickOnElectronicButtonToVerifyIsHighlighted() {
        uiPage.highlightedElement();
    }

    @Then("I verify the {string} using SubString function")
    public void iVerifyTheUsingRegexFunction(String function) {
        uiPage.usingSubStringFunction(function);
    }

    @And("I verify {string} using regex function")
    public void iVerifyUsingRegexFunction(String function) {
        uiPage.usingRegexFunction(function);
    }

    @When("I pass the {string}")
    public void i_pass_the(String keys) throws InterruptedException {
        uiPage.sendingTheValue(keys);
    }

    @And("I click on Follow Twitter Button")
    public void iClickOnFollowTwitterButton() {
        uiPage.clickFollowTwitterButton();
    }

    @Then("I move the new windows and click on sign in button")
    public void iMoveTheNewWindowsAndClickOnSignInButton() {
        uiPage.moveOnNewWindow();
    }

    @And("I scroll up the bottom page")
    public void iScrollUpTheBottomPage() throws InterruptedException {
        uiPage.getupPage();
    }

    @Then("I click on mouse hover on prime button")
    public void iClickOnMouseHoverOnPrimeButton() {
        uiPage.moveToElement();
    }

    @And("I click on Fresh right click button")
    public void iClickOnFreshRightClickButton() throws InterruptedException {
        uiPage.rightClickMethod();
    }

    @Then("I send the command using action class in Search Amazon Page")
    public void iSendTheCommandUsingActionClassInSearchAmazonPage() throws InterruptedException {
        uiPage.sendKeyUsingActionsClass();
    }

    @And("I scroll down the page")
    public void iScrollDownThePage() throws InterruptedException {
        uiPage.scrollDownUsingActionsClass();
    }

    @Then("I click on air conditioner button using javascript")
    public void iClickOnAirConditionerButtonUsingJavascript() {
        uiPage.clickFunctionUsingJavaScript();
    }

    @And("I pass the value using javaScript Executor")
    public void iPassTheValueUsingJavaScriptExecutor() throws InterruptedException {
        uiPage.sendKeysUsingJavaScriptExecutor();
    }

    @Then("I clear text Using javaScript Executor")
    public void iClearTextUsingJavaScriptExecutor() {
        uiPage.clearTextUsingJavaScript();
    }

    @And("I double click on MXPlayer Button")
    public void iDoubleClickOnMXPlayerButton() {
        uiPage.doubleClick();
    }

    @Then("I zoom in the WebPage using javaScript")
    public void iZoomInTheWebPageUsingJavaScript() {
        uiPage.zoomInWebPage();
    }
    @Then("I zoom Out the WebPage using javaScript")
    public void iZoomOutTheWebPageUsingJavaScript() {
        uiPage.zoomOutWebPage();
    }


    @Then("I send value using action class")
    public void iSendValueUsingActionClass() throws InterruptedException {
        uiPage.sendKeysUsingActionClass();
    }

    @Then("I select all the checkbox at a time")
    public void iSelectAllTheCheckboxAtATime() {
        uiPage.selectAllBoxes();
    }

}
