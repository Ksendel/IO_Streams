package com.company;

import java.io.IOException;
import java.util.Scanner;

public class AppTask3 {

    public static void main(String[] args) throws IOException {

        Task3 task3 = new Task3();

        System.out.println("\nEnter characters: ");

        Scanner in = new Scanner(System.in);
        String toEncrypt = in.nextLine();

        task3.encrypt('d', toEncrypt, "resources/task2.txt");

        System.out.println("\nYou can to read encrypt in file <Task2.txt>");

        System.out.println("\nYou can to read decryption in file <Task2_1.txt>");
        
        task3.decryption('d', "resources/task2.txt", "resources/task2_1.txt");

    }
}
