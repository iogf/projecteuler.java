/*

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

*/

import java.lang.StringBuilder;

public class Main {
    public static void main(String [] args) {
        final int DIGITS = 3;
        final long MAX_FACTOR = (int)Math.pow(10, (double)DIGITS) - 1;
        final long MAX_PRODUCT = MAX_FACTOR * MAX_FACTOR;
    
        long a;
        long b;

        a = oddP(2 * DIGITS - 1, MAX_PRODUCT);
        b = evenP(2 * DIGITS, MAX_PRODUCT);

        if(a > b) 
            System.out.println("Answer:" + a);
        else
            System.out.println("Answer:" + b);
    }

    /* 
        It generates palindromes of n digits in a 
        supposed ordered way. 
    */

    /*
        There are two cases. 
        If the number of digits is even
        the algorithm is different from when it is odd.
    */


    public static long oddP(int n, long max) {
        long a = (long)Math.pow(10, (double)((n-1)/2 - 1));
        long b = (long)Math.pow(10 , (double)((n-1)/2)) - 1;
        long i;
        long v;
        String m;
        for(i=9; i >= 0; i--) 
            for(; b >= a; b--) {
                m = Long.toString(b);
                m = m + Long.toString(i) + new StringBuilder(Long.toString(b)).reverse().toString();

                v = Long.parseLong(m);
                if(v < max && check(n + 1, v))
                    return v;
            }

        return 0;

    }

    public static long evenP(int n, long max) {
        long a = (long)Math.pow(10, (double)(n/2 - 1));
        long b = (long)Math.pow(10 , (double)(n/2)) - 1;
        long v;
        String m;

        for(; b >= a; b--) {
            m = Long.toString(b);
            m = m + new StringBuilder(Long.toString(b)).reverse().toString();

            v = Long.parseLong(m);
            if(v < max && check(n, v))
                return v;
        }
        
        return 0;
    }

    public static boolean check(int n, long v) {
        long a = (long)Math.pow(10, (double)(n/2 - 1));
        long b = (long)Math.pow(10 , (double)(n/2)) - 1;
        
        long c;
        for(; b >=a; b--){
            if(v % b == 0) {
                c = v/b;
                if(c <= Math.pow(10, (double)(n/2)) - 1) {
                    return true;
                }
            }
        }

        return false;
    }

}






