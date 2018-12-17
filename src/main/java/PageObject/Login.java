package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

    @FindBy(how = How.ID, using = "username")
    public WebElement Username;

    @FindBy(how = How.ID, using = "password")
    public WebElement Password;

    @FindBy(how = How.TAG_NAME, using = "button")
    public WebElement LoginBut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember351\"]/div/div/div/div/div[2]/div[10]/div/button")
    public WebElement AGREE;

    @FindBy(how = How.ID, using = "ember595")
    public WebElement CurrentPassword;

    @FindBy(how = How.ID, using = "ember596")
    public WebElement NewPassword;

    @FindBy(how = How.ID, using = "ember597")
    public WebElement NewPasswordConfirmation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember346\"]/div/div/div/table/tbody/tr/td[4]/button[1]")
    public WebElement SUB;

    @FindBy(how = How.CLASS_NAME, using = "close")
    public WebElement CLOSE;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember474\"]")
    public WebElement SERVER;
    //  @FindBy(how = How.CLASS_NAME, using = "message error")
    //  public WebElement ERR;
}


