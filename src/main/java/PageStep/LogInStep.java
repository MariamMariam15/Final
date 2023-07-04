package PageStep;

import PageObject.LogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;



public class LogInStep extends LogInPage {
    WebDriver driver;

    public LogInStep(WebDriver driver1) {

        driver = driver1;

    }

    @Step("Click SingButton")
    public void SingButton() {
        driver.findElement(SignInButton).click();

    }

    @Step("Enter Email")
    public void emailInput(String email) {
        driver.findElement(Email).sendKeys(email);

    }

    @Step("Enter Password")
    public void passwordInput(String password) {
        driver.findElement(Password).sendKeys(password);
    }

    @Step("Click LogIn Button ")
    public void LogInButton() {

        driver.findElement(Login).click();
    }

    @Step("Check empty email field validation message")
    public void checkemptymailvalidationmessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmptyEmailValidation));
        String ExpectedResult = driver.findElement(EmptyEmailValidation).getText();
        String ActualResult = "გთხოვთ შეიყვანოთ ტელეფონი / ელ-ფოსტა";
        Assert.assertEquals(ActualResult, ExpectedResult);


    }

    @Step("Check empty Password field validation message")
    public void checkemptypasswordvalidation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmptyPasswordValidation));
        String errormessage = driver.findElement(EmptyPasswordValidation).getText();
        System.out.println(errormessage);
        Assert.assertTrue(errormessage.contains("გთხოვთ შეიყვანოთ პაროლი"));
    }


    @Step("Check incorrect Email validation message")
    public void IncorrectEmailValidationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(IncorrectEmailValidation));
        String ExpectedResult = driver.findElement(IncorrectEmailValidation).getText();
        String ActualResuld = "ტელეფონი / ელ-ფოსტა ან პაროლი არასწორია";
        Assert.assertEquals(ActualResuld, ExpectedResult);


    }
   @Step("Check inccorect Password validation message")
    public void IncorrectPasswordValidation(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(IncorrectPassword));
       String ExpectedResult = driver.findElement(IncorrectPassword).getText();
       String ActualResuld = "ტელეფონი / ელ-ფოსტა ან პაროლი არასწორია";
       Assert.assertEquals(ActualResuld, ExpectedResult);
   }


    }










