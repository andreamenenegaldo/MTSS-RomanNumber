package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanPrinterTest {

    @Test
    public void test1to1000_validity() {
        for (int i = 1; i <= 1000; i++) {
            String result = RomanPrinter.print(i);

            // non deve essere null o vuoto
            assertNotNull(result);
            assertFalse(result.isEmpty());

            // deve contenere almeno una riga ASCII
            assertTrue(result.contains("\n"));

            // controllo base: niente caratteri strani nulli
            assertFalse(result.contains("null"));
        }
    }
}