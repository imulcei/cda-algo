package fr.afpa;

public class GrandQuinze {

    // JavaDoc : expliquer l'utilité de la fonction et ce à quoi correspondent les
    // paramètres d'entrée
    // ✅ Parfait
    /**
     * 
     * @param arrayNumbers
     * @param i
     * @return Renvoie une fonction récursive permettant d'additionner tous les
     *         éléments d'un tableau d'entiers.
     */
    public static int sommeTableauRecusive(int[] arrayNumbers, int i) {
        if (i <= arrayNumbers.length - 1) {
            return arrayNumbers[i] + sommeTableauRecusive(arrayNumbers, i + 1);
        }
        return 0;
    }

    // ✅ Parfait
    /**
     * 
     * @param str
     * @return Renvoie une fonction récursive qui prend en paramètre une String et
     *         qui renvoie la String avec chacune des lettres séparées par un tiret.
     */
    public static String insertSymbolString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(0) + "-" + insertSymbolString(str.substring(1));
    }

}
