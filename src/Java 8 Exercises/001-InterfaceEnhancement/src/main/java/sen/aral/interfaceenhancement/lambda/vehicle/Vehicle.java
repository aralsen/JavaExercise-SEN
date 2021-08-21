package sen.aral.interfaceenhancement.lambda.vehicle;

@FunctionalInterface
public interface Vehicle {
    void details();

    default void getMileage() {
        System.out.println("Showing mileage details");
    }
}
