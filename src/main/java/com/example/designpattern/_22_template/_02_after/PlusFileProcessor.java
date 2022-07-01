package com.example.designpattern._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlusFileProcessor extends Processor {

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    public int calculate(int number, int result) {
        return result += number;
    }
}
