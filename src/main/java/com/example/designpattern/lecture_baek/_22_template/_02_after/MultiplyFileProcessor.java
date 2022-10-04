package com.example.designpattern.lecture_baek._22_template._02_after;

public class MultiplyFileProcessor extends Processor {

    public MultiplyFileProcessor(String path) {
        super(path);
    }

    @Override
    public int calculate(int number, int result) {
        return result *= number;
    }
}
