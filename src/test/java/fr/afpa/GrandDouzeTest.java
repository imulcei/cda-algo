package fr.afpa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GrandDouzeTest {

    @Test
    public void palindromeTest() {
        assertTrue(GrandDouze.palindrome("Mon nom"));
        assertTrue(GrandDouze.palindrome("Esope reste ici et se repose"));
        assertTrue(GrandDouze.palindrome("La mariée ira mal."));
        assertTrue(GrandDouze.palindrome("Léon, émir cornu, d'un roc rime Noël."));
        assertTrue(GrandDouze.palindrome("Élu par cette crapule"));
    }
}