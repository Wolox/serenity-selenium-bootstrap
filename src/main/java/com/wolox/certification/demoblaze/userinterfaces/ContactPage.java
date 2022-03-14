package com.wolox.certification.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactPage {
    public static final Target TAB_CONTACT = Target.the("tab contact").located(By.xpath("//a[text()='Contact']"));
    public static final Target EMAIL_FIELD = Target.the("email input").located(By.id("recipient-email"));
    public static final Target NAME_FIELD = Target.the("contact name input").located(By.id("recipient-name"));
    public static final Target MESSAGE_FIELD = Target.the("contact name input").located(By.id("message-text"));
    public static final Target BTN_SEND_MESSAGE = Target.the("button contact").located(By.xpath("//button[text()='Send message']"));
}
