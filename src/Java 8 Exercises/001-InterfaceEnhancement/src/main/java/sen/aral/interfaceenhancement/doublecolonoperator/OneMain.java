package sen.aral.interfaceenhancement.doublecolonoperator;

public class OneMain {
    public static void main(String[] args)
    {
        LambdaOne lambdaOne = () -> System.out.println("from lambda one");
        lambdaOne.show();

        Employee employee = new Employee();

        LambdaOne lambdaOne1 = employee::details;
        lambdaOne1.show();

        LambdaTwo lambdaTwo = employee::details2;
        lambdaTwo.show2(20);

        LambdaTwo lambdaTwoStatic = Employee::detailsStatic;
        lambdaTwoStatic.show2(30);
    }
}
