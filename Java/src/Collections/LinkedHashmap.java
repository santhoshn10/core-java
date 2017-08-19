package Collections;
import java.util.*;
public class LinkedHashmap {

    public static void main(String args[]){

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(103,"Vijay");
        hm.put(102,null);

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
