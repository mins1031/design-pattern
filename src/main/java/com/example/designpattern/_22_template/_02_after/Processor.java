package com.example.designpattern._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface Processor {

    default int process(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            int result = calculate(reader);
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    abstract int calculate(BufferedReader reader) throws IOException;
}
