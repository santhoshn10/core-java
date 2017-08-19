package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist {

    public static void main(String args[]){
        LinkedList<Integer> al= new LinkedList<Integer>();
        al.add(202);
        al.add(222);
        al.add(222);
        al.add(0);
        //remove function
        al.remove(2);

        Iterator itr= al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for(Integer obj:al)
            System.out.println(obj);
    }
}
