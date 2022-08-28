package Optional;

import java.util.Optional;

public class OptionalOr {
    public static void main(String[] args)
    {
        // create a Optional
        Optional<Integer> op1
                = Optional.of(9455);
        // print supplier
        System.out.println("Optional: "
                + op1);
        // or supplier
        System.out.println("Optional by or(() ->"
                + " Optional.of(100)) method: "
                + op1.or(() -> Optional.of(100)));

        //------------------------------------------------------------------------

        // create a Optional
        Optional<Integer> op2
                = Optional.empty();
        // print supplier
        System.out.println("Optional: "
                + op2);
        try {
            // or supplier
            System.out.println("Optional by or(() ->"
                    + " Optional.of(100)) method: "
                    + op2.or(() -> Optional.of(100)));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
