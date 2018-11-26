package com;

public class ConsoleOutputter implements Outputer {
    public void log(String message) {
        System.out.println(message);
    }
}
