package com.wolox.certification.demoblaze.exceptions;

public class TheTextIsNotOnScreen extends AssertionError{
    public TheTextIsNotOnScreen(String message, Throwable cause) {
        super(message, cause);
    }
}
