package PageStep;

import PageObject.ResetPasswordPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ResetPasswordStep extends ResetPasswordPage {
    WebDriver driver;

    public ResetPasswordStep (WebDriver driver2){
        driver =driver2;
    }

    @Step ("Click Sign button")
    public void ClickSingButton (){

        driver.findElement(SignInButton).click();
     }

     @Step ("Click ResetPasswordButton")
    public void ClickResetPasswordButton(){
        driver.findElement(ResetPasswordButton).click();
    }
     @Step ("Enter Email")
    public void FillEmailField(String Email){

        driver.findElement(Emailfile).sendKeys(Email);
     }
     @Step ("Click Code SendButton")
    public void ClicksendCodeButton (){

        driver.findElement(CodeSendButton).click();
     }


  @Step ("Check No Registratio Email Validation Message")
  public  void CheckNorRgistrationEmail (){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(ValidationMessageNoRegistrationEmail));
       String ErrorMesage  = driver.findElement(ValidationMessageNoRegistrationEmail).getText();
      System.out.println(ErrorMesage);
      Assert.assertTrue(ErrorMesage.contains("ასეთი მომხმარებელი არ არსებობს"));
    }
  @Step("Check Invalid Email")
    public void CheckInvalidEmail(){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(ValidationMessageInvalidEmail));
      String ErrorMesage  = driver.findElement(ValidationMessageInvalidEmail).getText();
      System.out.println(ErrorMesage);
      Assert.assertTrue(ErrorMesage.contains("ასეთი მომხმარებელი არ არსებობს"));

  }
  @Step("Chck Empty Field Validation")
    public void CheckEmptyField(){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(ValidationEmptyField));
      String ErrorMesage  = driver.findElement(ValidationEmptyField).getText();
      System.out.println(ErrorMesage);
      Assert.assertTrue(ErrorMesage.contains("გთხოვთ შეიყვანოთ ტელეფონი / ელ-ფოსტა"));
  }
    }

