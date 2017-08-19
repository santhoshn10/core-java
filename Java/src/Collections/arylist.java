package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arylist {

    public static void main(String args[]){
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(20);
        al.add(22);
        al.add(22);
        al.add(0);

        Iterator itr= al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Integer obj:al)
            System.out.println(obj);
    }
}
