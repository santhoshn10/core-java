package Collections;

import java.util.*;

public class hasmap {

    public static void main(String args[]) {
        HashMap<Integer,Integer> hp = new HashMap<Integer,Integer>();
        // will not take null values
        hp.put(1,223);
        hp.put(2,null);
        hp.put(3,null);
        hp.put(4,223);
        hp.put(5,224);

        hp.remove(4);
       //Iterator wont work for hashmap
       // Iterator itr = hp.iterator();

      for(Map.Entry m:hp.entrySet())
          System.out.println(m.getKey()+" "+m.getValue());
    }
}
