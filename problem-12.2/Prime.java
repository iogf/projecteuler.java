import java.util.*;

public class Prime {
    List<Long> lst;
    long n;
    int index;

    public Prime() {
        lst   = new ArrayList<Long>();
        n     = 2;
        index = 0;
    }

    public void reset() {
        index = 0;
    }

    public long nextPrime() {
        long m;
        if(index >= lst.size()) 
            m = feed();
        else 
            m = lst.get(index);
        index++;
        return m;
        
    }

    public long feed() {
        for(; isDivisible(); n++);
        lst.add(n);
        return n++;
    }

    public boolean isDivisible() {
        long c;
        int i;

        /* It goes through all prime numbers 
           inside lst and checks whether n is divisible */

        for(i=0; i < lst.size(); i++) {
            c = lst.get(i);

            if(n % c == 0)
                return true;
        }
        return false;
    }
}
