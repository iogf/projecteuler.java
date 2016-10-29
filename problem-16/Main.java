/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/

import java.math.BigInteger;

public class Main {
    public static void main(String [] args) {
        final int EXP  = 1000;
        BigInteger val = new BigInteger("2");
        val            = val.pow(EXP);
        String strVal  = val.toString();
        long sum       = 0;
        int i;

        for(i = 0; i < strVal.length(); i++) 
            sum = sum + (long)Character.getNumericValue(strVal.charAt(i));

        System.out.println("Answer:" + sum);
    }
}
