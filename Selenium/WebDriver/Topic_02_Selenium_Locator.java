package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.lang.model.element.Name;
import java.util.concurrent.TimeUnit;

public class Topic_02_Selenium_Locator {

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
        driver.findElement(By.id("FirstName")).sendKeys("A");
    }

    @Test
    public void TC_02_Class() {
        driver.findElement(By.className("header-logo"));
    }


    @Test
    public void TC_03_Name() {
        driver.findElement(By.name("DateOfBirthDay"));
    }

    @Test
    public void TC_04_TagName() {
        // Used in the case  when you want to calculate the quantity tagname in the page
        driver.findElements(By.tagName("input"));

    }

    @Test
    public void TC_05_LinkText() {
        driver.findElement(By.linkText("Shipping & returns")).click();

    }
    @Test
    public void TC_06_Partial_LinkText() {
        driver.findElement(By.linkText("vendor account")).click();
    }

    @Test
    public void TC_07_Css() {
        //Css vs Id
        driver.findElement(By.cssSelector("input[id='FirstName']")).click();
        driver.findElement(By.cssSelector("input#FirstName")).click();
        driver.findElement(By.cssSelector("#FirstName")).click();

        //Css vs Class
        driver.findElement(By.cssSelector("div[class='page-title']")).click();
        driver.findElement(By.cssSelector("div.page-title")).click();
        driver.findElement(By.cssSelector(".page-title")).click();

        //Css vs Name
        driver.findElement(By.cssSelector("input[name='FirstName']")).click();

        //Css vs tagName
        driver.findElement(By.cssSelector("input")).click();

        //Css vs link
        driver.findElement(By.cssSelector("a[href='/customer/addresses']")).click();

        //Css vs partialLink
        driver.findElement(By.cssSelector("a[href*='addresses']"));
        driver.findElement(By.cssSelector("a[href^='addresses']"));
        driver.findElement(By.cssSelector("a[href$='addresses']"));
    }

    @Test
    public void TC_09_Xpath() {
        //Xpath vs Id
        driver.findElement(By.xpath("//input[@id='FirstName']"));

        //Css vs Class
        driver.findElement(By.cssSelector("div[class='page-title']"));
        driver.findElement(By.cssSelector("div.page-title"));
        driver.findElement(By.cssSelector(".page-title"));

        //Css vs Name
        driver.findElement(By.cssSelector("input[name='FirstName']"));

        //Css vs tagName
        driver.findElement(By.cssSelector("input"));

        //Css vs link
        driver.findElement(By.cssSelector("a[href='/customer/addresses']"));
    }



    @AfterClass
    public void afterClass() {
        //driver.quit();
        //update code
    }
}
