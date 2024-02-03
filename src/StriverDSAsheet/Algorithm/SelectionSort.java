package StriverDSAsheet.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Unsorted elements of Array: "+Arrays.toString(nums));

        sortedArray(nums, n);
        for (int i = 0; i < n; i++) {
            System.out.println("sorted elements of Array: "+ nums[i]);
        }
    }

    static void sortedArray(int[] nums, int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp= nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
    }
}
