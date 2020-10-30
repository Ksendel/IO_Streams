package com.company;

import java.io.*;
import java.util.Optional;
import java.util.stream.Stream;


public class Task {


    public Optional<String> maxCountWord(String fileName) throws IOException {

        Stream<String> reader = new BufferedReader(new FileReader(fileName)).lines();

        return reader.reduce((l, r) -> l.split(" ").length > r.split(" ").length ? l : r);
    }

}
