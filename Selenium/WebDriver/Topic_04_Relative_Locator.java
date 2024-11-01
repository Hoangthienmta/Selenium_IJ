//package WebDriver;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//
//public class Topic_04_Relative_Locator {
//
//    WebDriver driver;
//    String projectPath = System.getProperty("user.dir");
//    String osPath = System.getProperty("os.name");
//
//    @BeforeClass
//    public void beforeClass() {
//        if(osPath.contains("window")){
//            System.setProperty("webdriver.edge.driver",projectPath+"\\edgedriver_win64\\msedgedriver.exe");
//        } else {
//            System.setProperty("webdriver.chrome.driver",projectPath + "/chromedriver_win32/chromedriver.exe");
//        }
//
//        driver = new EdgeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        //driver.get("https://demo.nopcommerce.com/register");
//    }
//    @Test
//    public void TC_01_Relative() {
//
//        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fregister");
//        // Login button
//        WebElement loginButtonElement = driver.findElement(By.cssSelector("button.login-button"));
//
//        //Remember me checkbox
//        By remenberMeCheckbox = By.id("RememberMe");
//
//        //Forgot password link
//        WebElement forgotPassWordElement = driver.findElement(By.cssSelector("span.forgot-password"));
//
//        WebElement rememberMeText = driver
//                .findElement(RelativeLocator.with(By.tagName("label"))
//                .above(loginButtonElement)
//                .toRightOf(remenberMeCheckbox)
//                .toRightOf(forgotPassWordElement)
//                        .near(forgotPassWordElement));
//
//        System.out.println(rememberMeText.getText());
//    }
//
//    @Test
//    public void TC_02_Demo_RegisterEmptyData() {
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        driver.findElement(By.cssSelector("button.btn_pink_sm.fs16")).click();
//        String textMessError = driver.findElement(By.id("txtFirstname-error")).getText();
//        Assert.assertEquals(textMessError,"Vui lòng nhập họ");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        //driver.quit();
//        //update code
//    }
//
//}
