package sen.aral.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();

        names.add("Aral");
        names.add("Sen");
        names.add("Java");
        names.add("StreamAPI");

        //print length of every name
        System.out.println(names.stream()
                .map(String::length)
                .collect(Collectors.toList()));

        //find only those names whose length is greater than 5
        System.out.println(names.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList()));

        //find names whose length is greater then 5
        System.out.println(names.stream()
                .map(String::length)
                .filter(length -> length > 5)
                .collect(Collectors.toList()));

        //How many names exist that have length greater than 5
        Long num = names.stream()
                .filter(str -> str.length() > 5)
                .count();
        System.out.println(num);
    }
}
