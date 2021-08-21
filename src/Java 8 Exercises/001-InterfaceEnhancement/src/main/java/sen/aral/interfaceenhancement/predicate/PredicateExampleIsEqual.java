package sen.aral.interfaceenhancement.predicate;

import java.util.function.Predicate;

public class PredicateExampleIsEqual {
    public static void main(String[] args)
    {
        String name = "Aral";

        Predicate<String> isEqualPred = Predicate.isEqual("Aral");
        System.out.println(isEqualPred.test(name));
    }
}
