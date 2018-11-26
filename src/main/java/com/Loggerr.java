package com;


import java.util.ArrayList;
import java.util.List;

public class Loggerr {
    private boolean defaultConsoleLogger = true;
    private boolean fileLogger = false;
    List<Outputer> outputerList = new ArrayList<Outputer>();
    /*ConsoleOutputter consoleOutputter = new ConsoleOutputter();
    FileOutputter fileOutputter = new FileOutputter();*/
    public void log(String message){
        outputerList.get(outputerList.size()-1).log(message);
    }

    public void INFO(String message){
        String finalMessage = "INFO - "+System.currentTimeMillis()+" - ";
        finalMessage+=message;
        log(finalMessage);
    }

    public void ERROR(String message){
        String finalMessage = "ERROR - "+System.currentTimeMillis()+" - ";
        finalMessage+=message;
        log(finalMessage);
    }

    public void changeLoggerSource(ELoggerSource loggerSource){
        switch (loggerSource){
            case FILE:
                fileLogger = true;
                defaultConsoleLogger = false;
            case CONSOLE:
                defaultConsoleLogger = true;
                fileLogger = false;
        }

    }

    public void addOutputter(ELoggerSource source){
        if(source.equals(ELoggerSource.CONSOLE)){
            outputerList.add(new ConsoleOutputter());
        }else if(source.equals(ELoggerSource.FILE)){
            outputerList.add(new FileOutputter());
        }

    }

    public void removeOutputter(){

    }

    public List<Outputer> getOutputerList() {
        return outputerList;
    }

    public void setOutputerList(List<Outputer> outputerList) {
        this.outputerList = outputerList;
    }
}
