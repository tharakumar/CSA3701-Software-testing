import static org.junit.Assert.*;
import org.junit.Test;

public class VotingSystem {
    public boolean canVote(int age) {
        return age >= 18;
    }

    @Test
    public void testCanVote() {
        assertTrue(canVote(20));
        assertFalse(canVote(16));
    }
}
