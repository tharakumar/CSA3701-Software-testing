import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleInterest {
    public double calculateInterest(double principal, int age) {
        double rate = age >= 60 ? 12.0 : 10.0;
        return (principal * rate * 1) / 100;
    }

    @Test
    public void testInterest() {
        assertEquals(120.0, calculateInterest(1000, 60), 0.001);
        assertEquals(100.0, calculateInterest(1000, 30), 0.001);
    }
}
