package fr.afpa;

public class GrandDix {

    // ✅ Parfait
    /**
     * 
     * @param str Chaîne de caractères du nombre binaire à convertir
     * @return Renvoie le nombre en base 10
     */
    public static int conversionBaseDix(String str) {
        int result = 0;
        int puissance = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(str.charAt(i));
            result += num * (int) Math.pow(2, puissance);
            puissance++;
        }
        return result;
    }

    // ✅ Parfait
    /**
     * 
     * @param str Chaîne de caractère du nombre binaire à convertir
     * @return Renvoie une chaîne de caractères du nombre binaire
     */
    public static String conversionBinaire(int number) {
        String result = "";
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            int modulo = number % 2;
            result = modulo + result;
            number = number / 2;
        }
        return result;
    }
}
