package MountBlue;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        int temp;
        int sum=0;
        System.out.println("enter the number you want to check is Palindrome or not");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("it is palindrome!");
        }else {
            System.out.println("its not a palindrome!");
        }

    }
}
