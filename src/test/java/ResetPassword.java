import PageStep.ResetPasswordStep;
import Utils.GooglechromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.ResetPassword.*;

public class ResetPassword extends GooglechromeRunner {
    @Test(priority = 1)
    @Description("The user tries to reset password with correct Email")
    @Severity(SeverityLevel.CRITICAL)
    public void ResetPasswordCorrectEmail(){
        ResetPasswordStep step1 = new ResetPasswordStep(driver);
        step1.ClickSingButton();
        step1.ClickResetPasswordButton();
        step1.FillEmailField(CorrectEmail);
        step1.ClicksendCodeButton();

    }
    @Test(priority = 2)
    @Description("The user tries to reset password with non registration Email")
    public void ResetPasswordNonregistEmail() throws InterruptedException {
        ResetPasswordStep step2 = new ResetPasswordStep(driver);
        step2.ClickSingButton();
        step2.ClickResetPasswordButton();
        step2.FillEmailField( NoRegistrationEmail);
        step2.ClicksendCodeButton();
        step2.CheckNorRgistrationEmail();
        Thread.sleep(5000);

    }
    @Test(priority = 3)
    @Description("The user tries to reset password with ivalid Email(without @)")
    public void ResetPasswordInvalidEmail() throws InterruptedException {
        ResetPasswordStep step3 = new ResetPasswordStep(driver);
        step3.ClickSingButton();
        step3.ClickResetPasswordButton();
        step3.FillEmailField( InvalidEmail);
        step3.ClicksendCodeButton();
        step3.CheckInvalidEmail();
        Thread.sleep(5000);


    }
    @Test(priority = 4)
    @Description("The user tries to reset password with Empty Email field")
    public void ResetPasswordEmptyEmailField() throws InterruptedException {
        ResetPasswordStep step4 = new ResetPasswordStep(driver);
        step4.ClickSingButton();
        step4.ClickResetPasswordButton();
        step4.FillEmailField(EmptyEmailField);
        step4.ClicksendCodeButton();
        step4.CheckEmptyField();
        Thread.sleep(5000);


    }


}
