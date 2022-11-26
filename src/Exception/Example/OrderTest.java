package Exception.Example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.Ignore;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    private Order order;
    private OrderService orderService;

    @BeforeEach
    public void setUp() throws RuntimeException {
        order = new Order();
        orderService = new OrderService();
    }
    @Test
    public void testRuntimeException() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> order.loadOrder("milke"));
        String expectedMessage = "Article not available";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testRuntimeException1() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> orderService.loadOrder2(null));
        String expectedMessage = "Article not available";
        String actualMessage = exception.getMessage();
        assertEquals(actualMessage, expectedMessage);
    }
    @Test
    public void testSuccessResult() {
        String expectedArticle = "milk";
        String actualArticle = order.loadOrder("milk");
        assertTrue(expectedArticle.contains(actualArticle));
    }
    @Test
    public void testRuntimeException2() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> orderService.loadArticleName1("milke"));
        String expectedMessage = "No articlename found";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testRuntimeException3() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> orderService.loadArticleName2(null));
        String expectedMessage = "No articlename found";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testRuntimeException4() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> orderService.loadArticleName3("milke"));
        String expectedMessage = "No articlename found";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
