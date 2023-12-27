package StriverDSAsheet.JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class OneToNwithoutLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
//        sollution(x);
        int[] resultArray = sollution(x);

        // Print the generated array
        System.out.println("Generated Array: " + Arrays.toString(resultArray));

    }

    public static int[] sollution(int x){
        return generatedArray(x,1,new int[x]);
    }
    public static int[] generatedArray(int x, int count, int arr[]){
        if(count>x) return arr;
        arr[count-1]=count;
        generatedArray(x,count+1,arr);
        return arr;
    }
}
