package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String args[]){
        HashSet<Integer> hs= new HashSet<Integer>();
        hs.add(202);
        hs.add(222);
        hs.add(222);
        hs.add(null);

        hs.remove(22);
        Iterator itr= hs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
