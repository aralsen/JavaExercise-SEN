package sen.aral.interfaceenhancement.staticmethod;

/*
* Introduction of static method
*
* static methods are public by default
* static methods helps in bringing backward compatibility
* we cannot override static method
* Java 8 onwards main method can be part of interface
*/

public interface StaticMethodDemo {

    // static method don't get available in implementing class
    public static void show() {
        System.out.println("I am Java 8 static method");
    }

    // static method don't get available in implementing class
    public static void show2() {
        System.out.println("I am Java 8 static method 2");
    }
}
