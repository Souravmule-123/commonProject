package objectmanager;

import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;
import pageobject.UIPage;

public class PageObjectManager {
    private final WebDriver driver;
    private LoginPage amazonPage = null;
    private UIPage uiPage=null;

    public PageObjectManager(WebDriver driver){
    this.driver=driver;
    }

    public LoginPage getAmazonPage() {
        if (amazonPage == null) {
            amazonPage = new LoginPage(driver);
            return amazonPage;
        } else return amazonPage;
    }
    public UIPage getUiPage(){
        if(uiPage==null){
            uiPage=new UIPage(driver);
            return uiPage;
        }
        else return uiPage;
    }
}
