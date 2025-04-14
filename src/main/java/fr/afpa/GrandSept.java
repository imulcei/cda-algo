package fr.afpa;

public class GrandSept {

    /**
     * 
     * @param number Nombre de lignes et colonnes choisis
     */
    public static void pyramide(int number) {
        char asterisk = '*';
        int i = 0;
        String result = "";
        while (i < number) {
            result += asterisk;
            System.out.println(result);
            i++;
        }
    }

    /**
     * 
     * @param number Nombre de lignes et colonnes choisis
     */
    public static void triangle(int number) {
        char asterisk = '*';
        int i = 0;
        String result = "";

        while (i < number) {
            result += asterisk;
            System.out.println(result);
            i++;
        }

        while (i > 0) {
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
            i--;
        }
    }
}
