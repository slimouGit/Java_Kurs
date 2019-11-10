package Prevent_IfStatements._02_AlternateSolution;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {
    static Map<Operator, Operation> operationMap = new HashMap<>();
    static {
        operationMap.put(Operator.ADD, new Addition());
        operationMap.put(Operator.DIVIDE, new Division());
        operationMap.put(Operator.MULTIPLY, new Multiply());
        operationMap.put(Operator.SUBTRACT, new Substract());
    }

    public static Optional<Operation> getOperation(Operator operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }

}

