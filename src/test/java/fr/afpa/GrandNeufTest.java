package fr.afpa;

import org.junit.jupiter.api.Test;

public class GrandNeufTest {

    @Test
    public void countVoyellesTest() {
        int result = GrandNeuf.countVoyelles("Aaah oooh eeeh");
        System.out.println(result);
    }
}
