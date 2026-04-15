import org.junit.jupiter.api.Test;

import src.main.java.NumberProcessor;

import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    @Test
    public void testProcess_basic() {
        int result = NumberProcessor.process(3);
        assertEquals(-2, result);
    }
    
    @Test
    public void testZero() {
        assertEquals(0, NumberProcessor.process(0));
    }

    @Test
    public void testOne() {
        assertEquals(-1, NumberProcessor.process(1));
    }

    @Test
    public void testTwo() {
        assertEquals(1, NumberProcessor.process(2));
    }

    @Test
    public void testThree() {
        assertEquals(-2, NumberProcessor.process(3));
    }
}