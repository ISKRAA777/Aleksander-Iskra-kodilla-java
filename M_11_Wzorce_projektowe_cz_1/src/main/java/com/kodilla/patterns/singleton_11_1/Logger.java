package com.kodilla.patterns.singleton_11_1;

public class Logger {
    private String lastLog = "";
    private static Logger loggerInstance;
    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    private Logger() {

    }

    public static Logger getInstance(){
        if (loggerInstance == null) {
            synchronized(SettingsFileEngine.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public String getLastLog() {
        return lastLog;
    }
}