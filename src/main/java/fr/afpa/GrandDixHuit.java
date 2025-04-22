package fr.afpa;

public class GrandDixHuit {

    /**
     * 
     * @param str
     * @param shiftValue
     * @return Renvoie la string chiffrée
     */
    public static String encryptString(String str, int shiftValue) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (str.charAt(i) == alphabet[j]) {
                    result += alphabet[(j + shiftValue) % 26];
                }

                if (str.charAt(i) == ' ') {
                    continue;
                }
            }
        }
        return result;
    }

    /**
     * 
     * @param str
     * @param shiftValue
     * @return Renvoie la string déchiffrée
     */
    public static String decryptString(String str, int shiftValue) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (str.charAt(i) == alphabet[j]) {
                    result += alphabet[(j - shiftValue) % 26];
                }
                if (str.charAt(i) == ' ') {
                    continue;
                }
            }
        }
        return result;
    }
}
