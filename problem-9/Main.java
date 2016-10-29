/*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

public class Main {
    public static void main(String [] args) {
        final int SUM = 1000;
    
        System.out.println("Answer:" + find(SUM));

    }


    public static int find(int sum) {
        int i;
        int j;
        int k;

        long a;
        long b;
        long c;


        for(i = 0; i < sum; i++) 
            for(j = 0; j < i; j++)
                for(k = 0; k < j; k++) {
                    a = (long)Math.pow(i, 2);
                    b = (long)Math.pow(j, 2);
                    c = (long)Math.pow(k, 2);
                    if(b + c == a)
                        if(i + j + k == sum) 
                            return i * j * k;
                }
        return -1;
    }
}
