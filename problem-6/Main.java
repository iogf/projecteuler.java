/*



The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/

public class Main {
    public static void main(String [] args) {
        final long MAX = 100;
        long m = 0;
        long n = 0;

        long i;
        for(i = 1; i <= MAX; i++)
            n = n + (long)Math.pow(i, 2);

        for(i = 1; i <= MAX; i++) 
            m = m + i;
        m = (long)Math.pow(m, 2);
        System.out.println("Answer:" + (m - n));
    }

}
