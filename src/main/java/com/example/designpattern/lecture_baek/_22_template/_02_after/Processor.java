package com.example.designpattern.lecture_baek._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Processor {

    private String path;

    public Processor(String path) {
        this.path = path;
    }

    public int process(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result = calculate(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    protected abstract int calculate(int number, int result);
}
