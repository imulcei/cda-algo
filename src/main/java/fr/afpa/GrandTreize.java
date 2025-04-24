package fr.afpa;

public class GrandTreize {

    // ✅ Parfait
    /**
     * 
     * @param card_number
     * @return Renvoie si le numéro de carte bancaire est valide ou non.
     */
    public static boolean algorithmeDeLuhn(long card_number) {
        String card_numberStr = Long.toString(card_number);
        int sum = 0;
        boolean doubleIt = false;
        for (int i = card_numberStr.length() - 1; i >= 0; i--) {
            int valueAtIndex = Character.getNumericValue(card_numberStr.charAt(i));
            if (doubleIt) {
                sum += sumDoubledNumber(valueAtIndex * 2);
            } else {
                sum += valueAtIndex;
            }
            doubleIt = !doubleIt;
        }
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
