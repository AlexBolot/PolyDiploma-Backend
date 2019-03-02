import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.*;

public class GuestTest {
    public Guest g1;

    @BeforeAll
    public void setUp() {
    }

    @Test
    public void constructionTest() {
        g1 = new Guest("a", "b", true);
        assertFalse(g1.hasPayed());
        g1 = new Guest("b", "a", false);
        assertTrue(g1.hasPayed());
    }

}