package tdd.roman;

import org.junit.Assert;
import org.junit.Test;

public class RomanTest {

    @Test
    public void shouldFormatOne() {
        Roman roman = new Roman();

        Assert.assertEquals("I", roman.formatRoman(1));
    }

    @Test
    public void shouldFormatTwo() {
        Roman roman = new Roman();

        Assert.assertEquals("II", roman.formatRoman(2));
    }

    @Test
    public void shouldFormatThree() {
        Roman roman = new Roman();

        Assert.assertEquals("III", roman.formatRoman(3));
    }

    @Test
    public void shouldFormatFour() {
        Roman roman = new Roman();

        Assert.assertEquals("IV", roman.formatRoman(4));
    }

    @Test
    public void shouldFormatFive() {
        Roman roman = new Roman();

        Assert.assertEquals("V", roman.formatRoman(5));
    }

    @Test
    public void shouldFormatSix() {
        Roman roman = new Roman();

        Assert.assertEquals("VI", roman.formatRoman(6));
    }

    @Test
    public void shouldFormatSeven() {
        Roman roman = new Roman();

        Assert.assertEquals("VII", roman.formatRoman(7));
    }

    @Test
    public void shouldFormatEight() {
        Roman roman = new Roman();

        Assert.assertEquals("VIII", roman.formatRoman(8));
    }

    @Test
    public void shouldFormatNine() {
        Roman roman = new Roman();

        Assert.assertEquals("IX", roman.formatRoman(9));
    }

    @Test
    public void shouldFormatTen() {
        Roman roman = new Roman();

        Assert.assertEquals("X", roman.formatRoman(10));
    }

    @Test
    public void shouldFormatFourteen() {
        Roman roman = new Roman();

        Assert.assertEquals("XIV", roman.formatRoman(14));
    }

    @Test
    public void shouldFormatFifteen() {
        Roman roman = new Roman();

        Assert.assertEquals("XV", roman.formatRoman(15));
        Assert.assertEquals("XVI", roman.formatRoman(16));
        Assert.assertEquals("XVII", roman.formatRoman(17));
        Assert.assertEquals("XVIII", roman.formatRoman(18));
        Assert.assertEquals("XIX", roman.formatRoman(19));
    }

    @Test
    public void shouldFormatTwentyFour() {
        Roman roman = new Roman();

        Assert.assertEquals("XXIV", roman.formatRoman(24));
        Assert.assertEquals("XXXIV", roman.formatRoman(34));
    }

    @Test
    public void shouldFormatTeen() {
        Roman roman = new Roman();

        Assert.assertEquals("XI", roman.formatRoman(11));
        Assert.assertEquals("XII", roman.formatRoman(12));
        Assert.assertEquals("XIII", roman.formatRoman(13));
    }

    @Test
    public void shouldFormatForty() {
        Roman roman = new Roman();

        Assert.assertEquals("XL", roman.formatRoman(40));
        Assert.assertEquals("XLIX", roman.formatRoman(49));
    }

    @Test
    public void shouldFormatFifty() {
        Roman roman = new Roman();

        Assert.assertEquals("L", roman.formatRoman(50));
        Assert.assertEquals("LIX", roman.formatRoman(59));
    }

    @Test
    public void shouldFormatHundred() {
        Roman roman = new Roman();

        Assert.assertEquals("XC", roman.formatRoman(90));
        Assert.assertEquals("XCIX", roman.formatRoman(99));
        Assert.assertEquals("C", roman.formatRoman(100));
        Assert.assertEquals("CX", roman.formatRoman(110));
        Assert.assertEquals("CL", roman.formatRoman(150));
        Assert.assertEquals("CXLIX", roman.formatRoman(149));
        Assert.assertEquals("CCC", roman.formatRoman(300));
    }

    @Test
    public void shouldFormatFiveHundred() {
        Roman roman = new Roman();

        Assert.assertEquals("CD", roman.formatRoman(400));
        Assert.assertEquals("CDL", roman.formatRoman(450));
        Assert.assertEquals("CDXCIX", roman.formatRoman(499));
        Assert.assertEquals("D", roman.formatRoman(500));
        Assert.assertEquals("DL", roman.formatRoman(550));
        Assert.assertEquals("DXCIX", roman.formatRoman(599));
        Assert.assertEquals("DC", roman.formatRoman(600));
        Assert.assertEquals("DCC", roman.formatRoman(700));
        Assert.assertEquals("DCCC", roman.formatRoman(800));
        Assert.assertEquals("DCCCXCIX", roman.formatRoman(899));
    }

    @Test
    public void shouldFormatThousand() {
        Roman roman = new Roman();

        Assert.assertEquals("CM", roman.formatRoman(900));
        Assert.assertEquals("CMXCIX", roman.formatRoman(999));
        Assert.assertEquals("M", roman.formatRoman(1000));
        Assert.assertEquals("MCDL", roman.formatRoman(1450));
        Assert.assertEquals("MD", roman.formatRoman(1500));
        Assert.assertEquals("MCMXCIX", roman.formatRoman(1999));
        Assert.assertEquals("MM", roman.formatRoman(2000));
        Assert.assertEquals("MMM", roman.formatRoman(3000));
        Assert.assertEquals("MMMCMXCIX", roman.formatRoman(3999));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForExceededNumber() {
        Roman roman = new Roman();

        roman.formatRoman(4000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeOne() {
        Roman roman = new Roman();

        roman.formatRoman(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForNegativeTwo() {
        Roman roman = new Roman();

        roman.formatRoman(-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowForZero() {
        Roman roman = new Roman();

        roman.formatRoman(0);
    }
}
