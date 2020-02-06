package ru.qa.st.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestWebPage {

    protected WebDriver wd;

    public TestWebPage(WebDriver wd){

        PageFactory.initElements(wd,this);
        this.wd = wd;
    }


    @FindBy(xpath = "//a[contains(text(),'Маркет')]")
    private WebElement someButton;


    public TestWebPage goToSomeWhere() {
        someButton.click();
        return this;
    }

    public TestWebPage sendSomeValue(String someText) {
        //rangeFrom.click();
        //rangeFrom.sendKeys(someText);
        return this;
    }
}
