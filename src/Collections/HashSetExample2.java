package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args){

        Integer[] a= {1, 2, 3, 3, 3,4,5,6};
        Integer[] b={2,5,7,10,12,8,9,0};

        Set<Integer> set1=new HashSet<Integer>();
        set1.addAll(Arrays.asList(a));
        System.out.println(set1);

        Set<Integer> set2=new HashSet<Integer>();
        set2.addAll(Arrays.asList(b));
        System.out.println(set2);

        Set<Integer> set3=new HashSet<Integer>();
        set3.addAll(set1);
        set3.addAll(set2);

        set3.forEach((Integer in)->{
            System.out.println(in);
        });
    }
}
