import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseWordTest {
    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    @Test
    public void testReverse() {
        assertEquals("cba", reverse("abc"));
        assertEquals("olleh", reverse("hello"));
    }
}
