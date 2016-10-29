/*

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

*/

import java.lang.StringBuilder;

public class Main {
    public static void main(String [] args) {
        final int DIGITS = 7;
        final long MAX_FACTOR = (int)Math.pow(10, (double)DIGITS) - 1;
        final long MAX_PRODUCT = MAX_FACTOR * MAX_FACTOR;
    
        long a;
        long b;
        a = evenP(2 * DIGITS - 1, MAX_PRODUCT);

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
        long val;
        long i;
    
        String rev;
        StringBuilder m;
        StringBuilder tmp;

        for(i=9; i >= 0; i--) 
            for(; b >= a; b--) {
                m = new StringBuilder(Long.toString(b));
                m.append(i);

                rev = Long.toString(b);
                tmp = new StringBuilder(rev);
                m.append(tmp.reverse());


                val = Long.parseLong(m.toString());
                if(val < max && check(n + 1, val))
                    return val;
            }

        return 0;

    }

    public static long evenP(int n, long max) {
        long a = (long)Math.pow(10, (double)(n/2 - 1));
        long b = (long)Math.pow(10 , (double)(n/2)) - 1;
        long val;

        String rev;
        StringBuilder m;
        StringBuilder tmp;

        for(; b >= a; b--) {
            m = new StringBuilder(Long.toString(b));

            rev = Long.toString(b);
            tmp = new StringBuilder(rev);
            m.append(tmp.reverse());

            val = Long.parseLong(m.toString());

            if(val < max && check(n, val))
                return val;
        }
        
        return 0;
    }

    public static boolean check(int n, long val) {
        long a = (long)Math.pow(10, (double)(n/2 - 1));
        long b = (long)Math.pow(10 , (double)(n/2)) - 1;
        
        long c;
        long r;

        for(; b >=a; b--){
            if(!(val % b == 0)) 
                continue;

            c = val/b;
            r = (long)Math.pow(10, (double)(n/2)) - 1;

            if(c <= r)
                return true;
        }

        return false;
    }

}








