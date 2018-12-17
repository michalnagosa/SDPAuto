package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ADDPair {


    @FindBy(how = How.XPATH, using = "//*[@id=\"ember627\"]")
    public WebElement PlusBut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember665\"]")
    public WebElement PairName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember666\"]")
    public WebElement INTAddress;

    //@FindBy(how = How.ID, using = "ember582")
    //public WebElement INTPort;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember668\"]")
    public WebElement EXTAddress;

    @FindBy(how = How.ID, using = "ember669")
    public WebElement SaveBut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember346\"]/div/div/div/form/div/div/div[7]/div/button")
    public WebElement SAFELY;

    @FindBy(how = How.CLASS_NAME, using = "close")
    public WebElement SUCCESS;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember771\"]/button")
    public WebElement SavePairMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember774\"]/button")
    public WebElement SuccessAppliedMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember346\"]/div/div/div/form/div/div/div[2]/div[3]/div/div/button[1]")
    public WebElement PingBut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember777\"]")
    public WebElement PingSuccess;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember777\"]/button")
    public WebElement CloseSuccessPingMess;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember739\"]")
    public WebElement LicenceTab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ember346\"]/div/div/div/form/div/form[1]/button")
    public WebElement GenerateLocenceReqBut;


    //@FindBy(how = How.XPATH, using = "//*[@id=\"ember346\"]/div/div/div/form/div/div[4]/div/button")
    // public WebElement CancelBut;

}

