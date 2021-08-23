package sen.aral.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamSorted {
    public static void main(String[] args)
    {
        Random r = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            numbers.add(r.nextInt(100));
        }

        System.out.println(numbers);

        // ascending sort
        System.out.println(numbers.stream()
                .sorted()
                .collect(Collectors.toList()));

        //custom order
        System.out.println(numbers.stream()
                .sorted( (num1, num2) -> num2.compareTo(num1)) //Comparator::reverseOrder
                .collect(Collectors.toList()));
    }
}
