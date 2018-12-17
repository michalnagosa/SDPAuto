package Test;

import PageObject.ADDPair;
import PageObject.Login;
import Util.Login1;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Sanity extends Login1 {


    @BeforeClass
    public static void startWeb() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://10.10.10.227:3000");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        hp = PageFactory.initElements(driver, Login.class);
        ap = PageFactory.initElements(driver, ADDPair.class);

        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,3000)");
        hp.AGREE.click();
        Thread.sleep(5000);
    }

    @Test
    public void test1() throws InterruptedException {

        hp.Username.sendKeys("admin");
        hp.Password.sendKeys("rsaccess12345");
        hp.LoginBut.click();
        hp.CurrentPassword.sendKeys("rsaccess12345");
        hp.NewPassword.sendKeys("ZAQ!1qazXS");
        hp.NewPasswordConfirmation.sendKeys("ZAQ!1qazXS");
        hp.SUB.click();
        Thread.sleep(5000);

        hp.CLOSE.click();
        Thread.sleep(500);
        hp.SERVER.click();

    }

    @Test
    public void test2() throws InterruptedException{

        Thread.sleep(5000);
        ap.PlusBut.click();
        Thread.sleep(5000);
//     ap.PlusBut.click();

        ap.PairName.sendKeys("Test");
        ap.INTAddress.sendKeys("10.10.10.179");
        ap.EXTAddress.sendKeys("10.10.10.177;10.10.178");


        ap.SaveBut.click();

//        JavascriptExecutor ser = (JavascriptExecutor) driver;
        Thread.sleep(10000);

        ap.SUCCESS.click();
        // Thread.sleep(5000);;
        Thread.sleep(10000);

        Coordinates cor = ((Locatable) ap.SAFELY).getCoordinates();

        cor.inViewPort();

        Thread.sleep(5000);

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        ap.SAFELY.click();

        Thread.sleep(10000);

        ap.SavePairMessage.click();
        ap.SuccessAppliedMessage.click();

        Thread.sleep(1000);
        ap.PingBut.click();

        Thread.sleep(500);
        //  String text = ap.PingSuccess.getText();
        //Verify.verify(Boolean.parseBoolean(text),"Internal server ping successful");
        //  Assert.assertEquals(text, "Internal server ping successful");

        Thread.sleep(500);

        ap.CloseSuccessPingMess.click();

        Thread.sleep(500);
        ap.LicenceTab.click();
        Thread.sleep(500);
        ap.GenerateLocenceReqBut.click();


    }


}

