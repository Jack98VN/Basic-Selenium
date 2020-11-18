package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends  GeneralPage{

    //Locators
    private final By _txtUsername = By.xpath("");
    private final By _txtPassword = By.xpath("");
    private final By _btnLogin    = By.xpath("");
    private final By _lblLoginErrorMsg = By.xpath("");

    //Elements
    public WebElement getTxtUsername(){
        return Constant.WEBDRIVER.findElement(_txtUsername);
    }
    public WebElement getTxtUserPassword(){
        return Constant.WEBDRIVER.findElement(_txtPassword);
    }
    public WebElement getBtnLogin(){
        return Constant.WEBDRIVER.findElement(_btnLogin);
    }
    public WebElement getlblWebMessage() {
        return Constant.WEBDRIVER.findElement(_lblLoginErrorMsg);
    }

    //Methods
    public HomePage login(String username,String password)
    {
        //Submit login credetials
        this.getTxtUsername().sendKeys(username);
        this.getTxtUserPassword().sendKeys(password);
        this.getBtnLogin().click();
        //Land on HomePage
        return new HomePage();
    }
}
