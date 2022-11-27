package Exception.Example.Auftrag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuftragTest {
    private AuftragService auftragService;

    @BeforeEach
    public void setUp() throws RuntimeException {
        auftragService = new AuftragService();
    }

    @Test
    public void runtimeExceptionWare(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> auftragService.findByWare(null));
        String expectedMessage = "keine Ware gefunden";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void runtimeExceptionLieferant(){
        RuntimeException exception = assertThrows(RuntimeException.class, () -> auftragService.findByLieferant(null));
        String expectedMessage = "keinen Lieferanten gefunden";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
