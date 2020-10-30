package com.company;

import com.sun.nio.sctp.MessageInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class AppTask {

    public static void main(String[] args) throws IOException {

        Task task = new Task();

        System.out.print("Enter file path: ");

        Scanner in = new Scanner(System.in);
        String path = in.nextLine();

        File file = new File(path);

        try {
            if (file.exists()) {
                String maxRow = task.maxCountWord(path).orElse("File is empty");
                System.out.printf("Max row: [%s]", maxRow);
            } else {
                System.out.print("The file is not found in the specified location");
            }
        } catch (Exception e) {
            System.out.print("ПАМИЛКА");
        }






    }
}
