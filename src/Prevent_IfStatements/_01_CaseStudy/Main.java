package Prevent_IfStatements._01_CaseStudy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(
                calculator.calculate(5, 5, "multiply")
        );

        System.out.println(
                calculator.calculateUsingSwitch(5,5,"add")
        );
    }
}
