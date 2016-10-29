/*
This is the solution to problem 1 from projecteuler.
*/

public class Main {
    public static void main(String [] args) {
        System.out.println("The sum is:" + find(1000));
    }

    public static long find(long n) {
        int i;
        long sum = 0;
        for(i=1; i < n; i++) {
            if((i % 5) == 0 || (i % 3) == 0)
                sum = sum + i;
        }
        return sum;

    }
}
