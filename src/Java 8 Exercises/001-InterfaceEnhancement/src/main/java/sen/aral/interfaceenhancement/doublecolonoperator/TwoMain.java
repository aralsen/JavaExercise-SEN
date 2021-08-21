package sen.aral.interfaceenhancement.doublecolonoperator;

public class TwoMain {

    public static void main(String[] args) {

        //ConsRefFuncInterface consRefFuncInterface = () -> new Employee();
        //consRefFuncInterface.getEmployee();

        ConsRefFuncInterface consRefFuncInterface2 = Employee::new;
        consRefFuncInterface2.getEmployee();
    }
}