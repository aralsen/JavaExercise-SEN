package sen.aral.interfaceenhancement.predicate;

public class PredicateDemo implements Predicate <Integer> {
    @Override
    public boolean test(Integer age)
    {
        if (age > 18)
            return true;
        else
            return false;
    }
}
