package org.example.assumptions;


public class EnvironmentUtil {

    public static boolean runOnlyInCi() {
        return true; // pretend CI-only logic
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }

    public static boolean linuxSpecificCheck() {
        return true; // pretend Linux-only check
    }
}
