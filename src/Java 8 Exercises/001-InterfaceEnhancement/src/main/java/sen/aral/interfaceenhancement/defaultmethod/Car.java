package sen.aral.interfaceenhancement.defaultmethod;

public class Car implements VachileOlder {

    public static void main(String [] a) {
        Car car = new Car();
        car.details();
    }

    @Override
    public void details()
    {
        System.out.println("You don't need to override me, if you choose Java 8"); //look method with *default* keyword in VechileJava8
    }
}
