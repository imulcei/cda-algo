package fr.afpa;

public class GrandTreize {

    public static boolean algorithmeDeLuhn(long card_number) {
        String card_numberStr = Long.toString(card_number);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = card_numberStr.length() - 2; i >= 0; i -= 2) {
            int valueAtIndex = Character.getNumericValue(card_numberStr.charAt(i));
            sum1 += sumDoubledNumber(valueAtIndex * 2);
        }
        if (card_numberStr.length() % 2 == 0) {
            for (int i = 1; i < card_numberStr.length(); i += 2) {
                int valueAtIndex2 = Character.getNumericValue(card_numberStr.charAt(i));
                sum2 += valueAtIndex2;
            }
        } else {
            for (int i = 0; i < card_numberStr.length(); i += 2) {
                int valueAtIndex2 = Character.getNumericValue(card_numberStr.charAt(i));
                sum2 += valueAtIndex2;
            }
        }
        int sum = sum1 + sum2;

        if (sum % 10 != 0) {
            return false;
        } else {
            return true;
        }

    }

    public static int sumDoubledNumber(int num) {
        int modulo = num % 10;
        int result = 0;
        if (modulo != 0) {
            result = modulo;
            num = num / 10;
            result += num;
            return result;
        }
        return modulo;
    }

}
