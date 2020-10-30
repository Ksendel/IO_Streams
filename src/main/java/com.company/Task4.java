package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task4 {

    public void urlReader(URL url) throws IOException {

        Stream<String> lines = new BufferedReader(new InputStreamReader(url.openStream())).lines();
        StringBuilder sb = new StringBuilder();

        lines.forEach(sb::append);
        String htmlPage = sb.toString();

        Pattern pattern = Pattern.compile("(<\\/(\\w+)>)+");
        Matcher matcher = pattern.matcher(htmlPage);

        Stream<String> tags = matcher.results().map(x -> x.group(1));

        Map<String, Integer> tagCounts = new HashMap<>();

        tags.forEach(tag -> {
            int tagCount = tagCounts.getOrDefault(tag, 0);
            tagCounts.put(tag, tagCount + 1);
        });

        tagCounts.forEach((tag, count) -> System.out.printf("\nTag: %s - count: %s", tag, count));
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("\nSorted tags alphabetically: ");

        tagCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach((tag) -> System.out.printf("\nTag: %s", tag));
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("\nSorted tags by count: ");

        tagCounts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach((tag) -> System.out.printf("\nTag: %s", tag));

    }

}
