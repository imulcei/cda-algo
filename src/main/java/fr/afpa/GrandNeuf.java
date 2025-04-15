package fr.afpa;

public class GrandNeuf {

    /**
     * 
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
     * 
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
     * 
     * @param str Phrase entrée par l'utilisateur
     * @return Renvoie la phrase en majuscule
     */
    public static String strToUppercase(String str) {
        String result = str.toUpperCase();
        return result;
    }

}
