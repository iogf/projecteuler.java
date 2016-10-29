/*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

import java.lang.Math;

public class Main {
    public static void main(String [] args) {
        final long VALUE = 600851475143L;

        System.out.println("Answer:" + find(VALUE));

    }

    public static long find(long n) {
        final long MAX = 2000000;
        //final int MAX = 10;
        long i;
        long sum = 0;

        for(i = 2; i < MAX; i++)
            if(isPrime(i)) {
                sum = sum + i;
            }
        return sum;
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




