package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Integer: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second Integer: ");
        int num2=sc.nextInt();
        int min=Math.min(num1,num2);
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                System.out.println("The Common factor: "+i+" ");
            }
        }
    }
}
