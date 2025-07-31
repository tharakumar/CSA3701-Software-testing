import static org.junit.Assert.*;
import org.junit.Test;

public class StringComparisonTest {
    @Test
    public void testCompareStrings() {
        String a = "hello";
        String b = "hello";
        assertEquals(a, b);
    }
}
