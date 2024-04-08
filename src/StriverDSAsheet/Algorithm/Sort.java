package StriverDSAsheet.Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted elements of Array: "+ Arrays.toString(arr));

        sorted(arr, n);
        System.out.println("sorted elements of Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i]);
        }




    }
    static void sorted(int[] arr,int n){
        for(int i = 0;i<n-1;i++){
                int min = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

    }
