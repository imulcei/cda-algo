package fr.afpa;

public class GrandDix {

    public static int conversionBaseDix(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int chiffre = Character.getNumericValue(str.charAt(i));
            int x = chiffre * 10;
            System.out.println(chiffre);
        }
        return result;
    }
}
