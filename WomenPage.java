package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class WomenPage {

    WebDriver driver;
    WebDriverWait webDriverWait;
    Action action;

    @FindBy(id = "//input[@id='layered_id_attribute_group_1']")
    public WebElement SizeS;

    @FindBy(id = "//input[@id='layered_id_attribute_group_2']")
    public WebElement SizeM;

    public WomenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
