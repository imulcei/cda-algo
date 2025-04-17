package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GrandTreizeTest {
    
    @Test
    public void algorithmeDeLuhnTest() {
        assertTrue(GrandTreize.algorithmeDeLuhn(79927398713L));
        assertTrue(GrandTreize.algorithmeDeLuhn(4263982640269299L));
        assertFalse(GrandTreize.algorithmeDeLuhn(8273123273520569L));
    }
}
