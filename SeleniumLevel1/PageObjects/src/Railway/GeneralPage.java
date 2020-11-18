package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Locators
public class GeneralPage {
    private final By tabLogin = By.xpath("");
    private final By tabLogout = By.xpath("");
    private final By lblWebMessage = By.xpath("");


    //Elements
    protected WebElement getTabLogin() {
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
        // getTabLogout chua su dung
    }
    protected WebElement getlblWebMessage(){
        return Constant.WEBDRIVER.findElement(lblWebMessage);
    }

//Methods
    public String getWebMessage(){
        return this.getlblWebMessage().getText();
    }
    public LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new LoginPage();
    }


}