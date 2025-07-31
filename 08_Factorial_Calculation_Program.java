import static org.junit.Assert.*;
import org.junit.Test;

public class Factorial {
    public long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, factorial(5));
    }
}
