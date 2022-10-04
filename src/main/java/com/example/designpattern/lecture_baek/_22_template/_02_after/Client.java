package com.example.designpattern.lecture_baek._22_template._02_after;

public class Client {

    public static void main(String[] args) {
        String path = "number.txt";

        Processor processor = new PlusFileProcessor(path);
        int result = processor.process(path);
        System.out.println(result);

        Processor multiProcessor = new MultiplyFileProcessor(path);
        int mulResult = multiProcessor.process(path);
        System.out.println(mulResult);
    }
}
