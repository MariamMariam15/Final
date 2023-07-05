package Utils;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public  class GooglechromeRunner {

    public static WebDriver driver = new ChromeDriver();


    @BeforeMethod
    @Description("The user tries to open Chrome brother and enter on this site:saqme.ge")
    public void openChrome() {
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://ss.ge/ka/udzravi-qoneba");



    }
    @AfterMethod
    @Description("The user tries to close the page after running every test")
    public void closeChrome() {
        driver.quit();


    }

}







