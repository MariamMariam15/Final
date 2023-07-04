import PageStep.LogInStep;
import Utils.GooglechromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.LogInData.*;

public class LogIn extends GooglechromeRunner {
    @Test(priority = 1)
    @Description("The user tries to Login with correct data")
    @Severity(SeverityLevel.CRITICAL)
    public void LoginWithInCorrectData() throws InterruptedException {

        LogInStep step1 = new LogInStep(driver);

        step1.SingButton();
        step1.EmailInput(CorrectEmail);
        step1.passwordInput(CorrectPassword);
        step1.LogInButton();

        Thread.sleep(5000);
    }

    @Test(priority = 2)
    @Description("The user tries to Login with incorrect Email and correct password")
    public void LogInWithIncorrectEmailAndCorrectpassword() throws InterruptedException {

        LogInStep step2 = new LogInStep(driver);
        step2.SingButton();
        step2.EmailInput(IncorrectEmail);
        step2.passwordInput(CorrectPassword);
        step2.LogInButton();
        step2.IncorrectEmailValidationMessage();
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    @Description("The user tries to Login with correct Email and incorrect password")
    public void LogInWithCorrectEmailAndIncorrectPassword() throws InterruptedException {

        LogInStep step3 = new LogInStep(driver);

        step3.SingButton();
        step3.EmailInput(CorrectEmail);
        step3.passwordInput(IncorrectPassword);
        step3.LogInButton();
        step3.IncorrectPasswordValidation();
        Thread.sleep(5000); //"რეალურ ტესტებში არ გამოვიყენებ  ლელა და ნათია მასწ :დ"

    }
    @Test(priority = 4)
    @Description("The user tries to Login with incorrect Email(without point)")
    public void LogInwithincorrectmeilwithoutPoint() throws InterruptedException {

        LogInStep step4 = new LogInStep(driver);

        step4.SingButton();
        step4.EmailInput(EmailWithoutPoint);
        step4.passwordInput(CorrectPassword);
        step4.LogInButton();
        step4.IncorrectEmailValidationMessage();
        Thread.sleep(5000);
    }

    @Test(priority = 5)
    @Description("The user tries to Login with incorrect Email (without com)")

    public void LogInwithincorrectmeilwithoutcom() throws InterruptedException {

        LogInStep step5 = new LogInStep(driver);

        step5.SingButton();
        step5.EmailInput(Emailwithoutcom);
        step5.passwordInput(IncorrectPassword);
        step5.LogInButton();
        step5.IncorrectEmailValidationMessage();
        Thread.sleep(5000);
    }

    @Test(priority = 6)
    @Description("The user tries to Login with incorrect Email(without @) ")
    public void LogInwithIncorrectEmailandCorrectPassword() throws InterruptedException {
        LogInStep step6 = new LogInStep(driver);
        step6.SingButton();
        step6.EmailInput(IncorrectEmail);
        step6.passwordInput(CorrectPassword);
        step6.LogInButton();
        step6.IncorrectEmailValidationMessage();
        Thread.sleep(5000);
    }

    @Test(priority = 7)
    @Description("The user tries to Login with non registration Email")
    public void NonregistrationEmail() throws InterruptedException {
        LogInStep step7 = new LogInStep(driver);
        step7.SingButton();
        step7.EmailInput(NonRegistrationEmail);
        step7.passwordInput(IncorrectEmail);
        step7.LogInButton();
        step7.IncorrectEmailValidationMessage();
        Thread.sleep(5000);

    }

    @Test(priority = 8)
    @Description("The user tries to Login with  correct Email and  empty password filed")
    public void validEmailandEmptyPasswordField() throws InterruptedException {
        LogInStep step8 = new LogInStep(driver);
        step8.SingButton();
        step8.EmailInput(CorrectEmail);
        step8.passwordInput(EmptyPasswordField);
        step8.LogInButton();
        step8.checkemptypasswordvalidation();
        Thread.sleep(5000);

    }

    @Test(priority = 9)
    @Description("The user tries to Login with empty Email filed and correct password")
    public void EmptyEmailfiledandCorrectPassword() throws InterruptedException {
        LogInStep step9 = new LogInStep(driver);
        step9.SingButton();
        step9.EmailInput(EmptyFieldEmail);
        step9.passwordInput(CorrectPassword);
        step9.LogInButton();
        step9.checkemptymailvalidationmessage();
        Thread.sleep(5000);


    }

    @Test(priority = 10)
    @Description("The user tries to Login with Empty Email and password fileds")
    public void EmptyEmailandPasswordFields() throws InterruptedException {
        LogInStep step10 = new LogInStep(driver);
        step10.SingButton();
        step10.EmailInput(EmptyFieldEmail);
        step10.passwordInput(EmptyPasswordField);
        step10.LogInButton();
        step10.checkemptymailvalidationmessage();
        step10.checkemptypasswordvalidation();
        step10.LogInButton();
        Thread.sleep(5000);
    }

}

