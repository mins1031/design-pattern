package com.example.designpattern._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyFileProcessor implements Processor{

    private String path;

    public MultiplyFileProcessor(String path) {
        this.path = path;
    }

    @Override
    public int calculate(BufferedReader reader) throws IOException {
        int result = 1;
        String line = null;
        while ((line = reader.readLine()) != null) {
            result *= Integer.parseInt(line);
        }

        return result;
    }
}
