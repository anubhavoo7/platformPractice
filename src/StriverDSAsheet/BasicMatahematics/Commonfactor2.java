package StriverDSAsheet.BasicMatahematics;

import java.util.Map;
import java.util.Scanner;

public class Commonfactor2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element: ");
        int a=sc.nextInt();
        System.out.println("Enter the second element: ");
        int b=sc.nextInt();
        int min= Math.min(a,b);

        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                System.out.println("common factor of first and second element is: "+i+" ");
            } else {
                System.out.println("no common factor found!");
            }
        }
    }
}
