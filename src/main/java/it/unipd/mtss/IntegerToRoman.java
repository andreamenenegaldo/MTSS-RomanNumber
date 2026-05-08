////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {
            500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    private static final String[] SYMBOLS = {
            "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public static String convert(int number) {
        if (number < 1 || number > 500) {
            throw new IllegalArgumentException(
                    "Number must be between 1 and 500, got: " + number);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                number -= VALUES[i];
            }
        }
        return result.toString();
    }
}
