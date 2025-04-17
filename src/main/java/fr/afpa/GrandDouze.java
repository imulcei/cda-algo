package fr.afpa;

import java.text.Normalizer;

public class GrandDouze {

    public static boolean palindrome(String str) {
        String palindromeStr = "";
        String lowerCaseStr = str.replaceAll("[\\p{Punct}\\s-]", "").toLowerCase();

        // déconstruction de la chaîne de caractères -> un caréctère unicode accentué
        // est en fait 2 caractères 'e' = ' ' '
        String normalizedString = Normalizer.normalize(lowerCaseStr, Normalizer.Form.NFD);
        // on enlève tout les caractères qui correspondent aux accents sans leur lettre

        String noAccentString = normalizedString.replaceAll("\\p{M}", "");

        // lowerCaseStr.replaceAll("\\p{M}", "");
        for (int i = noAccentString.length() - 1; i >= 0; i--) {
            palindromeStr += noAccentString.charAt(i);
        }
        if (palindromeStr.equals(noAccentString)) {
            return true;
        } else {
            return false;
        }
    }
}