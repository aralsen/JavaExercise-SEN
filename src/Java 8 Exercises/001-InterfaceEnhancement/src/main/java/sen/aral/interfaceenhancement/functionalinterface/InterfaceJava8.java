package sen.aral.interfaceenhancement.functionalinterface;

/*
    1. An interface having one and only one abstract method is functional
    2. Runnable interface had only 1 abstract method called run()  -ex. Functional interface
    3.Comparable interface had only 1 abstract method called compareTo()  -ex. Functional interface
    4. Funcitonal interface can have any number of default and static method but only one abstract method!
    */

@FunctionalInterface
public interface InterfaceJava8 {
    void show();  // 1 abstract method

    default void details() { //more than 1 default method
        System.out.println("details..");
    }

    default void details1() {
        System.out.println("details1...");
    }

    static String enquire() { //more than 1 static method
        return "Functional interface";
    }

    static String enquire2() {
        return "Functional interface";
    }
}


