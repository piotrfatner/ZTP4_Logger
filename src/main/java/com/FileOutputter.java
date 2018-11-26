package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputer {
    public void log(String message) {
        FileWriter out = null;
        try {
            out = new FileWriter("output.txt");
            out.write(message);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
