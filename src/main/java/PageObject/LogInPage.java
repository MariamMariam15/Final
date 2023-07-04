package PageObject;

import org.openqa.selenium.By;


public  class LogInPage {
            protected By

            SignInButton = By.className("login-btn"),
            Email = By.id("UserName"),
            Password = By.id("Password"),
            Login = By.className("login_btn"),
            IncorrectEmailValidation = By.className("text-danger"),
            EmptyEmailValidation = By.className("aletrText"),
            EmptyPasswordValidation = By.className ("recoVeredPassAlert"),
            IncorrectPassword = By.xpath("//*[@id=\"LoginForm\"]/div/div/div[2]/div[1]");



}
