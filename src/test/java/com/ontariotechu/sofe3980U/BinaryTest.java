package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    /**
     * Test The bitwiseAnd function with numbers of different length and different leading bits
     */
    @Test
    public void bitwiseAnd1()
    {
		Binary binary1=new Binary("01011");
		Binary binary2=new Binary("1001");
		Binary binary3=Binary.bitwiseAnd(binary1,binary2);
        assertTrue( binary3.getValue().equals("1001"));
    }

    /**
     * Test The bitwiseAnd function with numbers of the same length and same leading bits
     */
    @Test
    public void bitwiseAnd2()
    {
		Binary binary1=new Binary("11011");
		Binary binary2=new Binary("11011");
		Binary binary3=Binary.bitwiseAnd(binary1,binary2);
        assertTrue( binary3.getValue().equals("11011"));
    }

    /**
     * Test The bitwiseAnd function with numbers of the same length but different leading bits
     */
    @Test
    public void bitwiseAnd3()
    {
		Binary binary1=new Binary("01011");
		Binary binary2=new Binary("11011");
		Binary binary3=Binary.bitwiseAnd(binary1,binary2);
        assertTrue( binary3.getValue().equals("1011"));
    }

    /**
     * Test The bitwiseOr function with numbers of different length and different leading bits
     */
    @Test
    public void bitwiseOr1()
    {
		Binary binary1=new Binary("1011");
		Binary binary2=new Binary("01001");
		Binary binary3=Binary.bitwiseOr(binary1,binary2);
        assertTrue( binary3.getValue().equals("1011"));
    }

    /**
     * Test The bitwiseOr function with numbers of same length and different leading bits
     */
    @Test
    public void bitwiseOr2()
    {
		Binary binary1=new Binary("1100");
		Binary binary2=new Binary("0101");
		Binary binary3=Binary.bitwiseOr(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }

    /**
     * Test The bitwiseOr function with numbers of different length and same leading bits
     */
    @Test
    public void bitwiseOr3()
    {
		Binary binary1=new Binary("1011");
		Binary binary2=new Binary("11001");
		Binary binary3=Binary.bitwiseOr(binary1,binary2);
        assertTrue( binary3.getValue().equals("11011"));
    }

    /**
     * Test The multiply function with numbers of different length, with both leading 1's
     */
    @Test
    public void multiply1()
    {
		Binary binary1=new Binary("11001");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1001011"));
    }

    /**
     * Test The multiply function with numbers of same length, with both leading 1's
     */
    @Test
    public void multiply2()
    {
		Binary binary1=new Binary("100");
		Binary binary2=new Binary("101");
		Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("10100"));
    }

    /**
     * Test The multiply function with numbers of different length, with both leading 0's
     */
    @Test
    public void multiply3()
    {
		Binary binary1=new Binary("01001");
		Binary binary2=new Binary("001");
		Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1001"));
    }

    /**
     * Test The multiply function with numbers of same length, with both leading 0's
     */
    @Test
    public void multiply4()
    {
		Binary binary1=new Binary("01100");
		Binary binary2=new Binary("01010");
		Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue( binary3.getValue().equals("1111000"));
    }
}
