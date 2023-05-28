package tdd.roman;

import org.junit.Assert;
import org.junit.Test;

public class RomanTest {

    @Test
    public void shouldFormatOne() {
        Assert.assertEquals("I", Roman.formatRoman(1));
    }

    @Test
    public void shouldFormatTwo() {
        Assert.assertEquals("II", Roman.formatRoman(2));
    }

    @Test
    public void shouldFormatThree() {
        Assert.assertEquals("III", Roman.formatRoman(3));
    }

    @Test
    public void shouldFormatFour() {
        Assert.assertEquals("IV", Roman.formatRoman(4));
    }

    @Test
    public void shouldFormatFive() {
        Assert.assertEquals("V", Roman.formatRoman(5));
    }

    @Test
    public void shouldFormatSix() {
        Assert.assertEquals("VI", Roman.formatRoman(6));
    }

    @Test
    public void shouldFormatSeven() {
        Assert.assertEquals("VII", Roman.formatRoman(7));
    }

    @Test
    public void shouldFormatEight() {
        Assert.assertEquals("VIII", Roman.formatRoman(8));
    }

    @Test
    public void shouldFormatNine() {
        Assert.assertEquals("IX", Roman.formatRoman(9));
    }

    @Test
    public void shouldFormatTen() {
        Assert.assertEquals("X", Roman.formatRoman(10));
    }

    @Test
    public void shouldFormatFourteen() {
        Assert.assertEquals("XIV", Roman.formatRoman(14));
    }

    @Test
    public void shouldFormatFifteen() {
        Assert.assertEquals("XV", Roman.formatRoman(15));
        Assert.assertEquals("XVI", Roman.formatRoman(16));
        Assert.assertEquals("XVII", Roman.formatRoman(17));
        Assert.assertEquals("XVIII", Roman.formatRoman(18));
        Assert.assertEquals("XIX", Roman.formatRoman(19));
    }

    @Test
    public void shouldFormatTwentyFour() {
        Assert.assertEquals("XXIV", Roman.formatRoman(24));
        Assert.assertEquals("XXXIV", Roman.formatRoman(34));
    }

    @Test
    public void shouldFormatTeen() {
        Assert.assertEquals("XI", Roman.formatRoman(11));
        Assert.assertEquals("XII", Roman.formatRoman(12));
        Assert.assertEquals("XIII", Roman.formatRoman(13));
    }

    @Test
    public void shouldFormatForty() {
        Assert.assertEquals("XL", Roman.formatRoman(40));
        Assert.assertEquals("XLIX", Roman.formatRoman(49));
    }

    @Test
    public void shouldFormatFifty() {
        Assert.assertEquals("L", Roman.formatRoman(50));
        Assert.assertEquals("LIX", Roman.formatRoman(59));
    }

    @Test
    public void shouldFormatHundred() {
        Assert.assertEquals("XC", Roman.formatRoman(90));
        Assert.assertEquals("XCIX", Roman.formatRoman(99));
        Assert.assertEquals("C", Roman.formatRoman(100));
        Assert.assertEquals("CX", Roman.formatRoman(110));
        Assert.assertEquals("CL", Roman.formatRoman(150));
        Assert.assertEquals("CXLIX", Roman.formatRoman(149));
        Assert.assertEquals("CCC", Roman.formatRoman(300));
    }

    @Test
    public void shouldFormatFiveHundred() {
        Assert.assertEquals("CD", Roman.formatRoman(400));
        Assert.assertEquals("CDL", Roman.formatRoman(450));
        Assert.assertEquals("CDXCIX", Roman.formatRoman(499));
        Assert.assertEquals("D", Roman.formatRoman(500));
        Assert.assertEquals("DL", Roman.formatRoman(550));
        Assert.assertEquals("DXCIX", Roman.formatRoman(599));
        Assert.assertEquals("DC", Roman.formatRoman(600));
        Assert.assertEquals("DCC", Roman.formatRoman(700));
        Assert.assertEquals("DCCC", Roman.formatRoman(800));
        Assert.assertEquals("DCCCXCIX", Roman.formatRoman(899));
    }

    @Test
    public void shouldFormatThousand() {
        Assert.assertEquals("CM", Roman.formatRoman(900));
        Assert.assertEquals("CMXCIX", Roman.formatRoman(999));
        Assert.assertEquals("M", Roman.formatRoman(1000));
        Assert.assertEquals("MCDL", Roman.formatRoman(1450));
        Assert.assertEquals("MD", Roman.formatRoman(1500));
        Assert.assertEquals("MCMXCIX", Roman.formatRoman(1999));
        Assert.assertEquals("MM", Roman.formatRoman(2000));
        Assert.assertEquals("MMM", Roman.formatRoman(3000));
        Assert.assertEquals("MMMCMXCIX", Roman.formatRoman(3999));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForExceededNumber() {
        Roman.formatRoman(4000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeOne() {
        Roman.formatRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeTwo() {
        Roman.formatRoman(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForZero() {
        Roman.formatRoman(0);
    }
}
