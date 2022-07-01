package com.example.designpattern._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor implements Processor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    @Override
    public int calculate(BufferedReader reader) throws IOException {
        int result = 0;
        String line = null;
        while ((line = reader.readLine()) != null) {
            result += Integer.parseInt(line);
        }

        return result;
    }
}
