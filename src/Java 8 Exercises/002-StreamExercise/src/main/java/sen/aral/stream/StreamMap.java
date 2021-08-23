package sen.aral.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers3 = new ArrayList<>();

        for (int i = 1; i <= 8; i++ ) {
            numbers.add(i);
        }

        numbers3 = numbers.stream()
                          .map(num -> num*3)
                          .collect(Collectors.toList());

        numbers3.forEach(System.out::println);
    }
}
