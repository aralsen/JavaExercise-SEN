package sen.aral.interfaceenhancement.defaultmethod;

/* Introduction of default method
*
* default methods are abstract
* You can also override default methods if you want
* Supports backward compatibility
*/

public interface VachileJava8 {
    //since Java 8, (public, non-static)
    default void details() { // by default gets available to all implementing classes
        System.out.println("I am Java 8 default method");
    }

    void milage();
}
