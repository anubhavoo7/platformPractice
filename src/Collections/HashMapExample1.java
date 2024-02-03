package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();

        map.put(1,"Anubhav");
        map.put(2,"Apurv");
        map.put(3,"Savita Mishra");
        map.put(4,"Akshay Kumar Mishra");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
            
        }
