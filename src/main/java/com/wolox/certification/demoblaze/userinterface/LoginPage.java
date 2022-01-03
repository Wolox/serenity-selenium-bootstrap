package com.wolox.certification.demoblaze.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TAB_LOGIN = Target.the("tab para abrir el formulario del login").located(By.id("login2"));
    public static final Target USERNAME_FIELD = Target.the("input escribir el nombre de usuario").located(By.id("loginusername"));
    public static final Target PASSWORD_FIELD = Target.the("input escribir la contraseña").located(By.id("loginpassword"));
    public static final Target BTN_LOGIN = Target.the("boton para iniciar session").located(By.xpath("//button[text()='Log in']"));
    public static final Target WELCOME_MESSAGE = Target.the("mensaje de bienvenida").located(By.id("nameofuser"));
}
