package com;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        Loggerr loggerr = new Loggerr();
        //loggerr.changeLoggerSource(ELoggerSource.FILE);
        loggerr.addOutputter(ELoggerSource.CONSOLE);
        loggerr.INFO("test1");
        loggerr.ERROR("test2");
    }
}
