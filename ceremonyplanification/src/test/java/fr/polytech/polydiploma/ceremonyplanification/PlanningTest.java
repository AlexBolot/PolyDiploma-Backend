package fr.polytech.polydiploma.ceremonyplanification;

import fr.polytech.polydiploma.participantpool.Guest;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlanningTest {

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
