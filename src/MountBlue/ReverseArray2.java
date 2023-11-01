package MountBlue;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int start = 0;
        int end = array.length - 1;
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverseArray(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp=array[i];
                array[i]=array[array.length-1-i];
                array[array.length-1-i]=temp;
            }
    }
}