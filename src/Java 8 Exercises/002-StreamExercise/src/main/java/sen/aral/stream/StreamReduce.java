package sen.aral.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args)
    {
        OptionalInt optionalIntSum = IntStream.rangeClosed(1, 10).reduce(Integer::sum);

        if (optionalIntSum.isPresent())
            System.out.println(optionalIntSum.getAsInt());
    }
}
