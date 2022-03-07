package com.wolox.certification.demoblaze.utils.constants;

import net.thucydides.core.util.SystemEnvironmentVariables;

public class EnvironmentVariables {
    private static final net.thucydides.core.util.EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    public static final String BASE_URL = environmentVariables.getProperty("BASE_URL");

    public static String getVariable(String nameEnv) {
        return environmentVariables.getProperty(nameEnv);
    }
}
