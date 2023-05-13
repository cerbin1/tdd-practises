import org.junit.Assert;
import org.junit.Test;

public class RomanTest {

    @Test
    public void shouldFormatOne() {
        Assert.assertEquals("I", formatRoman(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeOne() {
        formatRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeTwo() {
        formatRoman(-2);
    }


    private String formatRoman(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return "I";
    }
}
