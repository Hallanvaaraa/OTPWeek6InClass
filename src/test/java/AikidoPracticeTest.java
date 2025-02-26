import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AikidoPracticeTest {

    private static AikidoPractice aikidoPractice;

    @BeforeEach
    void setUp() {
        aikidoPractice = new AikidoPractice();
    }

    @Test
    void addSession() {
        aikidoPractice.addSession(2);
        assertEquals(2, aikidoPractice.getTotalHours());
    }

    @Test
    void eligibleForGraduation() {
        aikidoPractice.addSession(50);
        assertFalse(aikidoPractice.eligibleForGraduation());
        aikidoPractice.addSession(50);
        assertTrue(aikidoPractice.eligibleForGraduation());
    }

    @Test
    void getTotalHours() {
        aikidoPractice.addSession(2);
        aikidoPractice.addSession(5);
        assertEquals(7, aikidoPractice.getTotalHours());
    }

    @Test
    void runApp() {
        // This method is not tested because it is a console application
    }
}