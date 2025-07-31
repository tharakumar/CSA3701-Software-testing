import static org.junit.Assert.*;
import org.junit.Test;

public class Conversion {
    public String toBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public String toOctal(int num) {
        return Integer.toOctalString(num);
    }

    @Test
    public void testConversion() {
        assertEquals("1010", toBinary(10));
        assertEquals("12", toOctal(10));
    }
}
