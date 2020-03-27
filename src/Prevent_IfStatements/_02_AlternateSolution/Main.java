package Prevent_IfStatements._02_AlternateSolution;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(
                calculator.calculateUsingFactory(12, 30, Operator.ADD)
        );
    }
}
