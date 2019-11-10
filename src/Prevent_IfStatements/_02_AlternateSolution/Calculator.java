package Prevent_IfStatements._02_AlternateSolution;

public class Calculator {
    public int calculateUsingFactory(int a, int b, Operator operator) {
        Operation targetOperation = OperatorFactory
                .getOperation(operator)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a, b);
    }
}
