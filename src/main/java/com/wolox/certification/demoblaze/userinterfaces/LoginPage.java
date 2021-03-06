package com.wolox.certification.demoblaze.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TAB_LOGIN = Target.the("tab login").located(By.id("login2"));
    public static final Target USERNAME_FIELD = Target.the("username input").located(By.id("loginusername"));
    public static final Target PASSWORD_FIELD = Target.the("password input").located(By.id("loginpassword"));
    public static final Target BTN_LOGIN = Target.the("button login").located(By.xpath("//button[text()='Log in']"));
    public static final Target WELCOME_MESSAGE = Target.the("Welcome message").located(By.id("nameofuser"));
}
