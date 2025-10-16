package app.java;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testSum() {
        int result = Main.sum(2 , 3);
        assertEquals(5, result);
    }
    @Test
    void testMultiply() {
        int result = Main.multiply(3, 4);
        assertEquals(12, result);
    }
}
