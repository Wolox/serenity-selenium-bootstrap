package com.wolox.certification.demoblaze.exceptions;

public class TheTextIsNotOnScreen extends AssertionError {
    public static final String WELCOME_MESSAGE_EXCEPTION = "The welcome message is not present on the screen";

    public TheTextIsNotOnScreen(String message, Throwable cause) {
        super(message, cause);
    }
}
