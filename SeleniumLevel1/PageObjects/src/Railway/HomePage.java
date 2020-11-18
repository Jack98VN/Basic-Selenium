package Railway;

import Constant.Constant;

public class HomePage extends GeneralPage {
    //Locators

    //Elements

    //Methods
    public  HomePage open(){
        Constant.WEBDRIVER.navigate().to(Constant.PageObjects_URL);
        return this;
    }
}
