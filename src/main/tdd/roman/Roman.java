package tdd.roman;

import java.util.LinkedHashMap;
import java.util.Map;

public class Roman {
    public Roman() {
    }

    public String formatRoman(int number) {
        if (number < 1) {
            throw new IllegalArgumentException();
        }
        if (number > 3999) {
            throw new IllegalArgumentException();
        }
        return formatRomanNonNegative(number);
    }

    private String formatRomanNonNegative(int number) {
        Map<Integer, String> digits = new LinkedHashMap<>();
        digits.put(1000, "M");
        digits.put(900, "CM");
        digits.put(500, "D");
        digits.put(400, "CD");
        digits.put(100, "C");
        digits.put(90, "XC");
        digits.put(50, "L");
        digits.put(40, "XL");
        digits.put(10, "X");
        digits.put(9, "IX");
        digits.put(5, "V");
        digits.put(4, "IV");
        digits.put(1, "I");
        return formatNumberWithDigits(number, digits);
    }

    private String formatNumberWithDigits(int remainder, Map<Integer, String> digits) {
        StringBuilder formattedNumber = new StringBuilder();
        for (Map.Entry<Integer, String> entry : digits.entrySet()) {
            while (remainder >= entry.getKey()) {
                formattedNumber.append(entry.getValue());
                remainder -= entry.getKey();
            }
        }
        return formattedNumber.toString();
    }
}
