package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args){
        Set<String> set=new HashSet<String>();
        set.add("Anubhav");
        set.add("Shivam");
        set.add("Raj");
        set.add("Anubhav");
//        ******######### printing object using forEach method #########*********
//        set.forEach((String str)->{
//            System.out.println(str);
//        });

//        *********########## printing using forEach Loop. ######************
        for (String s:set) {
            System.out.println(s);

        }
    }
}
