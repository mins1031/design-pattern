package com.example.designpattern._10_facade._01_before;

import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        String to = "urisegea@naver.com";
        String from  = "jminyeong96@gmail.com";
        String host = "127.0.0.1";


        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

//        try {
//            new MimeMe
//        }

    }
}
