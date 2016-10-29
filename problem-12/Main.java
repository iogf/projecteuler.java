/*

The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?

*/


public class Main {
    public static void main(String []args) {
        final int MAX = 500;
        /*
        long [] xs = {1, 3, 6, 10, 15, 21, 28};
        long [] ns = nDivisors(xs);
        int i;
        for(i = 0; i < ns.length; i++)
            System.out.print(ns[i] + " ");
        */
        //System.out.println("Answer " + nDivisors(10));

        long n = find(MAX);
        System.out.println("Answer " + n * (n + 1)/2);
    }

    public static long find(long n) {
        long i;
        int val;
        for(i = 2; true; i++) {
            val = nDivisors(i);

            if(val >= n)
                return i;
        }
    }

    public static int nDivisors(long n) {
        long i;
        int exp = -1;
        int prod = 1;
        long a = n;
        long b = n + 1;

        for(i = nextPrime(1);  a != 1 || b != 1; i = nextPrime(i)) {
            while(a % i == 0) {
                a = (long)a / i;
                exp++;
            }

            while(b % i == 0) {
                b = (long)b / i;
                exp++;
            }
            prod = prod * (exp + 1);
            exp = 0;
        }

        return prod;
    }



    public static long nextPrime(long n) {
        long i;
        long q;

        if(n == 1) return 2;

        if(n % 2 == 0)
            i = n + 1;
        else
            i = n + 2;
    
        for(; !isPrime(i); i += 2);
        return i;

    }

    public static boolean isPrime(long n) {
        long i;
        double root;

        if(n == 1) 
            return false;
        if(n == 2)
            return true;
        if(n % 2 == 0)
            return false;

        root = Math.sqrt(n);
        root = Math.floor(root);

        for(i=3; i <= (long)root; i += 2) 
            if(n % i == 0) 
                return false;

        return true;
    }


}


