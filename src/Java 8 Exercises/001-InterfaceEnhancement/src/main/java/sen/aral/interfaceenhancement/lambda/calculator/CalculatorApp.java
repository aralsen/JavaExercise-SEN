package sen.aral.interfaceenhancement.lambda.calculator;

public class CalculatorApp {
    public static void main(String[] args)
    {
        AddIntegers cal = (Integer a, Integer b) -> {return a + b;}; // if you have just 1 line, you can get rid of return statement
        //AddIntegers cal = (Integer a, Integer b) ->  a + b;
        //AddIntegers cal = Integer::sum;     one of the best ways, with method reference..

        Integer result = cal.add(5 ,7);
        System.out.println(result);

        MultiplyInterface multiplyInterface = () -> System.out.println("this is multiply func");
        multiplyInterface.multiply();
    }
}
