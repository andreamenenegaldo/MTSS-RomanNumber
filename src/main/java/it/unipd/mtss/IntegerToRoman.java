////////////////////////////////////////////////////////////////////
// Andrea Menegaldo 2116426
// Davide Menegaldo 2147950
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {
            1
    };

    private static final String[] SYMBOLS = {
            "I"
    };

    public static String convert(final int number) {

        StringBuilder result = new StringBuilder();
        int remaining = number;

        for (int i = 0; i < VALUES.length; i++) {

            while (remaining >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }

        return result.toString();
    }
}
