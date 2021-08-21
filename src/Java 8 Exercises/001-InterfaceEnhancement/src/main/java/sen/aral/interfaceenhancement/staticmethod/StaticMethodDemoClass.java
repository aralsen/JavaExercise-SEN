package sen.aral.interfaceenhancement.staticmethod;

public class StaticMethodDemoClass implements StaticMethodDemo {

    public static void show() {
        System.out.println("I am a normal method of this class StaticMethodDemoClass");
    }
    public static void main(String [] a) {
        StaticMethodDemoClass sdc = new StaticMethodDemoClass();
        sdc.show();

        StaticMethodDemo.show(); // static method can be called by the name of the interface
        StaticMethodDemo.show2();
    }
}
