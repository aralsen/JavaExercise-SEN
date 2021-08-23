package sen.aral.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {
    public static void main(String[] args)
    {
        //Streams helps to operate collection objects
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i <= 8; i++ ) {
            numbers.add(i);
        }

        //Stream<Integer> stream = numbers.stream();
        oddNumbers = numbers.stream()
                    .filter(num -> num % 2 != 0)
                    .collect(Collectors.toList());

        oddNumbers.forEach(System.out::println);
    }
}
