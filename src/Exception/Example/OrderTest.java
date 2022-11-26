package Exception.Example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {
    private Order order;

    @BeforeEach
    public void setUp() throws RuntimeException {
        order = new Order();
    }

    @Test
    public void testRuntimeException() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> order.loadOrder("milke"));
        String expectedMessage = "Article not available";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testSuccessResult() {
        String expectedArticle = "milk";
        String actualArticle = order.loadOrder("milk");
        assertTrue(expectedArticle.contains(actualArticle));
    }
}
