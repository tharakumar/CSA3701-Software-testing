import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheck {
    public boolean isPalindrome(int number) {
        int rev = 0, original = number;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }
        return original == rev;
    }

    @Test
    public void testPalindrome() {
        assertTrue(isPalindrome(121));
        assertFalse(isPalindrome(123));
    }
}
