package sen.aral.stream;

import java.util.Arrays;
import java.util.List;

public class StreamColonOperator {
    public static void main(String[] args)
    {
        List<String> alphaNumerics = Arrays.asList("A11", "A44", "a22", "a49","G66");

        alphaNumerics.stream()
                .map(String::toUpperCase)
                .filter(str -> str.startsWith("A"))
                .forEach(System.out::println);
    }
}
