package fr.afpa;

public class GrandNeuf {

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

}
