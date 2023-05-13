import org.junit.Assert;
import org.junit.Test;

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
    public void shouldFormatFive() {
        Assert.assertEquals("V", formatRoman(5));
    }

    @Test
    public void shouldFormatSix() {
        Assert.assertEquals("VI", formatRoman(6));
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

    private static String formatRomanNonNegative(int i) {
        String result = "";
        if (i >= 5) {
            result += "V";
            i -= 5;
        }
        for (int j = 0; j < i; j++) {
            result += "I";
        }
        return result;
    }
}
