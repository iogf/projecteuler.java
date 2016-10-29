/*



Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

 _ _
!_|_|
|_|_|


How many such routes are there through a 20×20 grid?

*/


public class Main {
    public static void main(String [] args) {
        final int START_X = 0;
        final int START_Y = 0;

        final int END_X = 20;
        final int END_Y = 20;

        long rts = 0;
        long m   = 0;
        long n   = 0;
        int i;
        int j;

        for(i = 0, j = END_Y; i <= END_X; i ++, j--) {
            m = snake(START_X, START_Y, i, j);
            n = snake(i, j,  END_X, END_Y);
            rts = rts + m * n;
        }

        System.out.println(rts);


    }

    public static long snake(int startX, int startY,
                             int endX,   int endY) {

        long sum = 0;
        if(startX == endX && startY == endY)
            return 1L;

        if(startX < endX)
            sum = sum + snake(startX + 1, startY, endX, endY);

        if(startY < endY)
            sum = sum + snake(startX, startY + 1, endX, endY);
        return sum;
    }
}




