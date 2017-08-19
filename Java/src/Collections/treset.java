package Collections;

import java.util.*;

public class treset {

    public static void main(String args[]) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        // will not take null values
        ts.add(202);
        ts.add(222);
        ts.add(222);
        ts.add(22);

        ts.remove(22);


        Iterator itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
