package pageobject;


import objectmanager.FileReaderManager;
import objectmanager.WaitManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;




public class LoginPage {
    private static final Logger log = LogManager.getLogger(LoginPage.class);
    WebDriver driver;
    WaitManager waitManager;
    Actions actions;


    @FindBy(xpath = "(//*[@data-csa-c-type='link'])[1]")
    WebElement accountAndList;
    @FindBy(xpath = "//*[text()='Sign in']")
    WebElement signIn;
    @FindBy(xpath = "//*[@type='email']")
    WebElement userName;
    @FindBy(xpath = "(//*[@type='submit'])")
    WebElement signInBtn;
    @FindBy(xpath = "//*[@type='password']")
    WebElement password;
    @FindBy(xpath = "(//*[@type='submit'])[1]")
    WebElement signInButton;
    @FindBy(xpath = "//*[@type='search']")
    WebElement searchBox;
    @FindBy(xpath = "//*[@id='example']/tbody")
    List<WebElement> table;
    @FindBy(xpath = "//*[@id='usernameField']")
    WebElement emailUserName;
    @FindBy(xpath = "(//*[@type='submit'])[1]")
    WebElement loginBtn;







    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitManager = new WaitManager(driver);
        actions = new Actions(driver);
    }
    public void loginDifferentPage(String url){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl(url));
        driver.navigate().refresh();
    }
    public void getTitle(String title){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, title);
    }

    public void enterUserNameAndPwd(String user, String pwd) throws InterruptedException {
        waitManager.applyWait(2000);
    actions.moveToElement(accountAndList).build().perform();
    signIn.click();
    waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(userName));
    userName.sendKeys(FileReaderManager.getInstance().getConfigReader().getAmazonUserName(user));
    signInBtn.click();
        waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(FileReaderManager.getInstance().getConfigReader().getAmazonPwd(pwd));
        signInButton.click();
    }

    public void toCheckTitle(){
        String title=driver.getTitle();
        System.out.println(title);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
       String currentPageSource=driver.getPageSource();
        System.out.println(currentPageSource);

    }

    public void refreshUrlUsingJavaScript() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("location.reload();");
    }

    public void enterNaukariCredential(String UsernameNaukari, String PwdNaukari) {
        waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(emailUserName));
        emailUserName.sendKeys(FileReaderManager.getInstance().getConfigReader().getNaukariUserName(UsernameNaukari));
        waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys(FileReaderManager.getInstance().getConfigReader().getNaukariPassword(PwdNaukari));
        loginBtn.click();


    }
}









