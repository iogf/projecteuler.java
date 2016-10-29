/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


*/

public class Main {
    public static void main(String [] args) {
        final int MAX = 20;

        long [] seq = new long[MAX];
        int i;
        for(i=0; i < MAX; i ++)
            seq[i] = i + 1;
        System.out.println(lcm(seq));

        /*
        long i;
        i = 1;
        for(; i < 100; i = nextPrime(i))
            System.out.print(i + " ");

        System.out.println(nextPrime(2));
        System.out.println(nextPrime(3));
        System.out.println(nextPrime(5));
        System.out.println(nextPrime(7));
        System.out.println(nextPrime(11));
        System.out.println(nextPrime(13));
        */

    }

    public static long lcm(long [] seq) {
        long val = 1;
        long i;
        int r;

        for(i=nextPrime(1); true;) {
            r = consume(seq, i);

            if(r == 1) {
                val = val * i;
                continue;
            }
            else if(r == 0) 
                i = nextPrime(i);
            else 
                return val * i;
        }    
    }
    
    public static int consume(long [] seq, long n) {
        int i;
        boolean q = false;
        boolean c = true;

        for(i = 0; i < seq.length; i++) {
            if(seq[i] % n == 0) {
                seq[i] = seq[i] / n;

                q = true;
            }

            if(seq[i] != 1)
                c = false;
        }

        if(c)
            return 2;
        else if(q)
            return 1;
        else
            return 0;
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
        if(n == 1)
            return false
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



