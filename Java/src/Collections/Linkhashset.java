package Collections;

import java.util.*;

public class Linkhashset {

    public static void main(String args[]){
        LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
        hs.add(202);
        hs.add(222);
        hs.add(222);
        hs.add(22);
        hs.add(null);

        hs.remove(22);


        Iterator itr= hs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
