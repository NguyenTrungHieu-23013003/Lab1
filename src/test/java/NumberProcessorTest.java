import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    @Test
    public void testProcess_basic() {
        int result = NumberProcessor.process(3);
        assertEquals(-2, result);
    }
}