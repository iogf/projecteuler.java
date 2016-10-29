/*

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

*/

public class Main {
    public static void main(String [] args) {
        final int X = 10001;
        int i;
        int j = 1;

        for(i = 3; true; ) {
            if(isPrime(i))
                j++;
            if(j < X)
                i = i + 2;
            else
                break;
        }

        System.out.println("Answer:" + i);
    }


    public static boolean isPrime(long n) {
        if(n % 2 == 0)
            return true;

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
