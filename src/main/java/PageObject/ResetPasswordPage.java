package PageObject;

import org.openqa.selenium.By;

public class ResetPasswordPage {
    protected By

            SignInButton = By.className("login-btn"),
            ResetPasswordButton = By.className("reset_password"),
            Emailfile = By.id("mobileOrMail"),

            CodeSendButton = By.className("verificationMailNumber"),

            ValidationMessageNoRegistrationEmail = By.className ("inputAlert"),
            ValidationMessageInvalidEmail = By.className ("inputAlert"),
            ValidationEmptyField = By.xpath("//*[@id=\"passRecover\"]/div[3]/div[3]/div/span[1]");




}
