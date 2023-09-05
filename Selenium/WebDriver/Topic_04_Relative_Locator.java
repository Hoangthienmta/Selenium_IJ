package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Topic_04_Relative_Locator {

    WebDriver driver;
    String projectPath = System.getProperty("user.dir");
    String osPath = System.getProperty("os.name");

    @BeforeClass
    public void beforeClass() {
        if(osPath.contains("window")){
            System.setProperty("webdriver.chrome.driver",projectPath+"\\chromedriver_win32\\chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver",projectPath + "/chromedriver_win32/chromedriver.exe");
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
    }
    @Test
    public void TC_01_ID() {

        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fregister");



    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
        //update code
    }

}
