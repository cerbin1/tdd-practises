import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanTest {

    @Test
    public void shouldFormatOne() {
        Assert.assertEquals("I", formatRoman(1));
    }

    @Test
    public void shouldFormatTwo() {
        Assert.assertEquals("II", formatRoman(2));
    }

    @Test
    public void shouldFormatThree() {
        Assert.assertEquals("III", formatRoman(3));
    }

    @Test
    public void shouldFormatFour() {
        Assert.assertEquals("IV", formatRoman(4));
    }

    @Test
    public void shouldFormatFive() {
        Assert.assertEquals("V", formatRoman(5));
    }

    @Test
    public void shouldFormatSix() {
        Assert.assertEquals("VI", formatRoman(6));
    }

    @Test
    public void shouldFormatSeven() {
        Assert.assertEquals("VII", formatRoman(7));
    }

    @Test
    public void shouldFormatEight() {
        Assert.assertEquals("VIII", formatRoman(8));
    }

    @Test
    public void shouldFormatNine() {
        Assert.assertEquals("IX", formatRoman(9));
    }

    @Test
    public void shouldFormatTen() {
        Assert.assertEquals("X", formatRoman(10));
    }

    @Test
    public void shouldFormatFourteen() {
        Assert.assertEquals("XIV", formatRoman(14));
    }

    @Test
    public void shouldFormatFifteen() {
        Assert.assertEquals("XV", formatRoman(15));
        Assert.assertEquals("XVI", formatRoman(16));
        Assert.assertEquals("XVII", formatRoman(17));
        Assert.assertEquals("XVIII", formatRoman(18));
        Assert.assertEquals("XIX", formatRoman(19));
    }

    @Test
    public void shouldFormatTwentyFour() {
        Assert.assertEquals("XXIV", formatRoman(24));
        Assert.assertEquals("XXXIV", formatRoman(34));
    }

    @Test
    public void shouldFormatTeen() {
        Assert.assertEquals("XI", formatRoman(11));
        Assert.assertEquals("XII", formatRoman(12));
        Assert.assertEquals("XIII", formatRoman(13));
    }

    @Test
    public void shouldFormatForty() {
        Assert.assertEquals("XL", formatRoman(40));
        Assert.assertEquals("XLIX", formatRoman(49));
    }

    @Test
    public void shouldFormatFifty() {
        Assert.assertEquals("L", formatRoman(50));
        Assert.assertEquals("LIX", formatRoman(59));
    }

    @Test
    public void shouldFormatHundred() {
        Assert.assertEquals("XC", formatRoman(90));
        Assert.assertEquals("XCIX", formatRoman(99));
        Assert.assertEquals("C", formatRoman(100));
        Assert.assertEquals("CX", formatRoman(110));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeOne() {
        formatRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeTwo() {
        formatRoman(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForZero() {
        formatRoman(0);
    }


    private String formatRoman(int i) {
        if (i < 1) {
            throw new IllegalArgumentException();
        }
        return formatRomanNonNegative(i);
    }

    private static String formatRomanNonNegative(int number) {
        Map<Integer, String> digits = new LinkedHashMap<>();
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

    private static String formatNumberWithDigits(int remainder, Map<Integer, String> digits) {
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
