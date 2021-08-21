package sen.aral.interfaceenhancement.lambda.vehicle;

public class VehicleLambdaMain {
    public static void main(String[] args)
    {
        Vehicle vehicle = () -> System.out.println("Vechile details after implementation");
        vehicle.details();
    }
}
