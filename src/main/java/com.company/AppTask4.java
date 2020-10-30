package com.company;

import java.io.IOException;
import java.net.URL;

public class AppTask4 {

    public static void main(String[] args) throws IOException {

        Task4 task4 = new Task4();
//        System.out.print("Enter URL: ");
        task4.urlReader(new URL("https://dou.ua/"));
    }
}
