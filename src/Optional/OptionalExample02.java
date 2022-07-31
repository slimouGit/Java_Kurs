package Optional;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class OptionalExample02 {

    @Test(expected = NullPointerException.class)
    public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
        String name = null;
        Optional.of(name);
    }

    @Test
    public void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = "baeldung";
        Optional<String> opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
    }

    public static void main(String[] args){
        String name1 = null;
        if(name1 == null) {
            name1 = "Ersatzname";
        }
        System.out.println(name1);//Ersatzname


        String name2 = "Mimi";
        Optional<String> opt1 = Optional.ofNullable(name2);
        String result1 = opt1.orElse("Ersatzname");
        System.out.println(result1);//Mimi

        String name3 = null;
        Optional<String> opt2 = Optional.ofNullable(name3);
        String result2 = opt2.orElse("Ersatzname");
        System.out.println(result2);//Ersatzname
    }
}
