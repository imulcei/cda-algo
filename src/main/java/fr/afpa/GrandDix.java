package fr.afpa;

public class GrandDix {

    /**
     * 
     * @param str Chaîne de caractères du nombre binaire à convertir
     * @return Renvoie le nombre en base 10
     */
    public static int conversionBaseDix(String str) {
        int result = Integer.parseInt(str, 2);
        return result;
    }

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
