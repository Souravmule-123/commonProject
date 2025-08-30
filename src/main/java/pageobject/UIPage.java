package pageobject;


import helper.TestContext;


import objectmanager.WaitManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;


import static appdata.Constant.dropDownOptionsList;


public class UIPage {

    TestContext testContext;
    WebDriver driver;
    Actions actions;
    WaitManager waitManager;
    Lock lock;


    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    WebElement signIn;
    @FindBy(xpath = "//*[text()='Returns']")
    WebElement returns;
    @FindBy(xpath = "//*[text()='Fresh']")
    WebElement fresh;
    @FindBy(xpath = "//*[text()='& Orders']")
    WebElement andOrder;
    @FindBy(xpath = "//*[text()='Sell']")
    WebElement sell;
    @FindBy(xpath = "//*[text()='Mobiles']")
    WebElement mobile;
    @FindBy(xpath = "//*[text()='Electronics']")
    WebElement electronic;
    @FindBy(xpath = "//*[text()='MX Player']")
    WebElement mxPalyer;
    @FindBy(xpath = "(//*[text()='Bestsellers'])[2]")
    WebElement bestSeller;
    @FindBy(xpath = "(//*[text()='New Releases'])[2]")
    WebElement newRelease;
    @FindBy(xpath = "(//*[text()='All'])[2]")
    WebElement all;
    @FindBy(tagName = "a")
    private List<WebElement> link;
    @FindBy(xpath = "//*[@name='url']")
    WebElement allDropDown;
    @FindBy(xpath = "//*[@name='url']")
    WebElement allProductDropDown;
    @FindBy(xpath = "(//*[@class='nav-line-1 nav-progressive-content'])[1]")
    WebElement mumbaiText;
    @FindBy(xpath = "//*[text()='Sell on Amazon.in']")
    WebElement functionRgx;
    @FindBy(xpath = "//*[@type='text']")
    WebElement valueSend;
    @FindBy(xpath = "//*[text()='  Follow On Twitter ']")
    WebElement twitterButton;
    @FindBy(xpath = "//*[text()='Sign up']")
    WebElement signUp;
    @FindBy(xpath = "//*[text()='Prime']")
    WebElement primeButton;
    @FindBy(xpath = "//*[text()='Air conditioners']")
    WebElement airConditioners;
    @FindBy(xpath = "//*[text()='Air conditioners']")
    WebElement firstFrame;
    @FindBy(xpath = "//*[text()='Air conditioners']")
    WebElement secondFrame;
    @FindBy(xpath = "//*[text()='Best Sellers']")
    WebElement bestSellers;
    @FindBy(xpath = "//*[@class='a-icon a-icon-checkbox']")
    List<WebElement> checkBoxes;

    public UIPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        waitManager=new WaitManager(driver);
        actions=new Actions(driver);
    }

    public void fullScrollMethod() throws InterruptedException {
        waitManager.applyWait(1000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        js.executeScript("window.scrollBy(0,4000)", ""); // bottom
//        waitManager.applyWait(2000);
//        js.executeScript("arguments[0].scrollIntoView();", signIn);
    }
    public void openNewTab() throws InterruptedException {
        waitManager.applyWait(5000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.myntra.com/");
    }
    public void openNewWindow() throws InterruptedException {
        waitManager.applyWait(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.myntra.com/");
    }
    public void closeTheBrowserUsingDifferentMethod() {
        driver.close();
//        driver.quit();
    }
    public void changeBrowserPosition() {
        Point p=new Point(400,400);
        driver.manage().window().setPosition(p);
    }
    public void changeBrowserSize() {
        Dimension d= new Dimension(500,700);
        driver.manage().window().setSize(d);
    }
    public void verifyText() {
//        String returnText=returns.getText();
//        Assert.assertEquals(returnText,"Returns");
//        System.out.println(returnText);
      Assert.assertTrue(returns.getText().contains("Returns"));
      System.out.println(returns.getText());
    }
    public void verifyTextName(String text) {
//        String returnFreshText=fresh.getText();
//        Assert.assertEquals(returnFreshText,text,"Fresh");
//        System.out.println(returnFreshText);
      Assert.assertTrue(fresh.getText().contains(text));
        System.out.println(fresh.getText());
    }
    public void verifyIsDisplayed() {
        Boolean ABC= fresh.isDisplayed();
        System.out.println(ABC);
    }
    public void verifyIsEnabled() {
        Boolean ABC=andOrder.isEnabled();
        System.out.println(ABC);
    }
    public void findOutLink() {
        int a=link.size();
        System.out.println(a);
    }
    public void TakeScreenshotMethod() throws IOException {
//        Regular Method
        File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File d= new File(("src/test/resources/Screenshot/sample.jpg"));
        FileUtils.copyFile(s,d);

        //FrameWork Method
//        Utility utility=new Utility();
//        utility.getScreenshotMethod(driver);

    }
    public void sikuliMouseMovement(String arg0){
//        String zoomJs;
//        SikuliUtil sikuliUtil = new SikuliUtil();
//        zoomJs = "document.body.style.zoom='0.7'";
//        js.executeScript(zoomJs);
//        js.executeScript("arguments[0].scrollIntoView()", fresh);
//        sikuliUtil.clickFreshButton(arg0);
    }

    public void clickSellTab() {
        sell.click();
    }

    public void clickMobileTab() {
        mobile.click();
    }

    public void clickTab(String tab) {
        WebElement button = driver.findElement(By.xpath("//*[text()='" + tab + "']"));
                    button.click();
    }

    public void subTabButton(String Tab) {
        switch (Tab){
            case "Best Seller":
            waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(bestSeller));
            bestSeller.click();
            break;
            case "new Releases":
                waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(newRelease));
                newRelease.click();
                break;
            default:
//                log.info("No");
        }
    }

    public void clickAllButtonTab() {
        all.click();
    }

    public void verifyNotEqualOperator(String text) {
        Assert.assertTrue(!fresh.getText().isEmpty(),text);
        System.out.println(fresh.getText());
    }

    public void selectClass(String value) throws InterruptedException {
        waitManager.applyWait(2000);
        Select select=new Select(allProductDropDown);
        select.selectByVisibleText(value);
    }

    public void usingtabledatacode(String value) throws InterruptedException {
        waitManager.applyWait(5000);
        actions.moveToElement(allDropDown).perform();
        List<WebElement>drop=driver.findElements(dropDownOptionsList);
        for (int i=0;i<drop.size();i++){
            if (drop.get(i).getText().equalsIgnoreCase(value)){
                drop.get(i).click();
                break;
            }
        }
    }

    public void highlightedElement() {
        waitManager.applyExplicitWait(20).until(ExpectedConditions.elementToBeClickable(electronic));
        electronic.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='10px solid red';", electronic);
//        js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid red;');", electronic);
    }

    public void usingSubStringFunction(String expuser) {
    String actualUser=mumbaiText.getText().substring(0,20);
        Assert.assertNotEquals(actualUser, expuser);
        System.out.println(actualUser);
    }

    public void usingRegexFunction(String exp) {
    String[] actual=functionRgx.getText().split(".");
        Assert.assertEquals(actual[1].trim(), exp);

    }

    public void sendingTheValue(String keys) throws InterruptedException {
        waitManager.applyWait(4000);
        valueSend.sendKeys(keys);
    }

    public void clickFollowTwitterButton() {
        twitterButton.click();
    }

    public void moveOnNewWindow() {
        String mainWindow=driver.getWindowHandle();         //current window handle method
        Set<String> allWindow= driver.getWindowHandles();  // Get all window handles
         for (String windowHandle:allWindow){
            if (!windowHandle.equals(mainWindow)){
                driver.switchTo().window(windowHandle);
                break;
            }
         }
        System.out.println("Title of the new window: " + driver.getTitle());
         signUp.click();
    }

    public void getupPage() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
     waitManager.applyWait(5000);
        js.executeScript("window.scrollBy(0,-4000)", ""); //top the page

    }

    public void moveToElement() {
        actions.moveToElement(primeButton).build().perform();
    }

    public void rightClickMethod() throws InterruptedException {
        waitManager.applyWait(3000);
        actions.contextClick(fresh).perform();
    }

    public void sendKeyUsingActionsClass() throws InterruptedException {
        waitManager.applyWait(3000);
    actions.sendKeys(valueSend,"Iphone").perform();
    }

    public void scrollDownUsingActionsClass() throws InterruptedException {
        waitManager.applyWait(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public void clickFunctionUsingJavaScript() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",airConditioners);
    }

    public void sendKeysUsingJavaScriptExecutor() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value = 'Samsung';", valueSend);
        waitManager.applyWait(2000);

    }

    public void clearTextUsingJavaScript(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value = '';", valueSend);
    }

    public void doubleClick() {
        actions.doubleClick(mxPalyer).perform();
        driver.navigate().back();
    }

    public void zoomInWebPage() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom='150%'");
    }

    public void zoomOutWebPage() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("document.body.style.zoom='75%'");
    }

    public void textVerifed() {
        Assert.assertEquals(bestSellers.getText(),"Best Sellers");
    }

    public void sendKeysUsingActionClass() throws InterruptedException {
        waitManager.applyWait(3000);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].value='Iphone';", valueSend);
//        actions.moveToElement(valueSend).click().sendKeys("testuser").perform();


    }

    public void selectAllBoxes() {
        int num=checkBoxes.size();
        for(int i=0;i<num;i++)
        { checkBoxes.get(i).click(); }
    }
}

