package sen.aral.interfaceenhancement.lambda.vehicle;

public class VehicleMain {

    public static void main(String[] args)
    {
        System.out.println("main method");

        VehicleImpl vehicle = new VehicleImpl();
        vehicle.details();

        Vehicle vehicle1 = new VehicleImpl();
        vehicle.details();
    }
}
