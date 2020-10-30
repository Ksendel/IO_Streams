package com.company;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {

    public void encrypt(char key, String text, String outpath) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char encrypted = (char) ((int) text.charAt(i) + (int) key);
            sb.append(encrypted);
        }

        FileOutputStream fos = new FileOutputStream(outpath);

        byte[] bytes = sb.toString().getBytes();
        fos.write(bytes);
        fos.close();

    }

    public void decryption(char key, String fileName, String outpath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        int symbol = reader.read();

        while (symbol != -1) {
            char decryption = (char) (symbol - (int) key);
            sb.append(decryption);
            symbol = reader.read();
        }

        FileOutputStream fos = new FileOutputStream(outpath);
        byte[] bytes = sb.toString().getBytes();
        fos.write(bytes);
        fos.close();
    }
}
