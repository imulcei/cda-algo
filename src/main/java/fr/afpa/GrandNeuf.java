package fr.afpa;

public class GrandNeuf {

    /**
     * ✅ okay
     * @param str Phrase entrée par l'utilisateur
     * @return Renvoie le nombre de voyelles de la phrase
     */
    public static int countVoyelles(String str) {
        char[] voyelles = { 'a', 'e', 'i', 'o', 'u', 'y' };
        int numberOfVoyelles = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            for (int j = 0; j < voyelles.length; j++) {
                if (lowerStr.charAt(i) == voyelles[j]) {
                    numberOfVoyelles += 1;
                    System.out.println(lowerStr.charAt(i));
                }
            }
        }
        return numberOfVoyelles;
    }

    /**
     * ✅ okay
     * @param str Phrase entrée par l'utilisateur
     * @return Renvoie le nombre de majuscule dans la phrase
     */
    public static int countMaj(String str) {
        int numberofMaj = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isUpperCase(character)) {
                numberofMaj++;
            }
        }
        return numberofMaj;
    }

    /**
     * ✅ okay
     * @param str Phrase entrée par l'utilisateur
     * @return Renvoie la phrase en majuscule
     */
    public static String strToUppercase(String str) {
        String result = str.toUpperCase();
        return result;
    }

    /**
     *✅ okay
     * @param str Phrase entrée par l'utilisateur
     * @return Renvoie le mirroir de la phrase
     */
    public static String strMirror(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i > -1; i--) {
            char character = str.charAt(i);
            newStr += character;
        }
        return newStr;
    }

    /**
     * ✅ okay
     * @param str Phrase entrée par l'utilisateur
     * @return Renvoie la phrase en camel case
     */
    public static String strToCamelCase(String str) {
        // sépare les mots où il y a des espaces
        String[] words = str.split("[\\W_]");
        StringBuilder modifiedStr = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                // premier mot en minuscule
                modifiedStr.append(Character.toLowerCase(word.charAt(0)));
                modifiedStr.append(word.substring(1));
            } else {
                // tous les mots suivants ont leurs 1e lettres en majuscule
                modifiedStr.append(Character.toUpperCase(word.charAt(0)));
                modifiedStr.append(word.substring(1));
            }

        }
        return modifiedStr.toString();
    }

    /**
     * ✅ okay
     * @param str    Phrase entrée par l'utilisateur
     * @param subStr Sous-chaine à localiser
     * @return Renvoie les indexes du 1e et dernier caractère
     */
    public static int[] locateString(String str, String subStr) {
        int i = 0;
        int j = 0;
        int indexStart = 0;
        boolean found = false;
        while (!found && i < str.length()) {
            if (str.charAt(i) == subStr.charAt(j)) {
                if (j == 0) {
                    indexStart = i;
                }
                j++;
            }
            i++;
            if (j == subStr.length()) {
                found = true;
            }
        }
        if (!found) {
            return new int[] { -1, -1 };
        }

        int[] result = { indexStart, indexStart + subStr.length() - 1 };
        return result;
    }
}
