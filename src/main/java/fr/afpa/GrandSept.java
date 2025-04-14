package fr.afpa;

public class GrandSept {

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
