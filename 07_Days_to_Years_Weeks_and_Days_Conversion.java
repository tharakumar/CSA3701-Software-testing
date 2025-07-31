import static org.junit.Assert.*;
import org.junit.Test;

public class DaysConversion {
    public int[] convert(int days) {
        int years = days / 365;
        int weeks = (days % 365) / 7;
        int remainingDays = (days % 365) % 7;
        return new int[]{years, weeks, remainingDays};
    }

    @Test
    public void testConvert() {
        int[] result = convert(400);
        assertArrayEquals(new int[]{1, 5, 0}, result);
    }
}
