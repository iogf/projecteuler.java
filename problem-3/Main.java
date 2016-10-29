/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

import java.lang.Math;

public class Main {
    public static void main(String [] args) {
        final long VALUE = 600851475143L;

        System.out.println("Answer:" + find(VALUE));
    /*
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(23));
        System.out.println(isPrime(51));
        System.out.println(isPrime(55));
    */

    }

    public static long find(long n) {
        long i;
        double root;
        root = Math.sqrt(n);
        root = Math.floor(root);

        for(i=(long)root; i >= 2; i--) 
            if((n % i == 0) && isPrime(i))
                return i;
        return n;
    }

    public static boolean isPrime(long n) {
        if(n == 2)
            return true;

        if(n % 2 == 0)
            return false;

        long i;
        double root;

        root = Math.sqrt(n);
        root = Math.floor(root);

        for(i=3; i <= (long)root; i += 2) 
            if(n % i == 0) 
                return false;

        return true;
    }
}



