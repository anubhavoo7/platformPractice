package MountBlue;

import java.util.Arrays;

public class ReverseArray {

//  *****######  Recursion method  #####******

    public static void main(String[] args){
        int[] array={1,2,3,4};
        int start=0;
        int end=array.length-1;
        reverseArray(array,start,end);
        System.out.println(Arrays.toString(array));
    }
    static void reverseArray(int[] array, int start, int end){
        if(start>end)return;
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        reverseArray(array,start+1,end-1);
    }
}
