package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverseNo=0;
        int lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            reverseNo=(reverseNo*10)+lastDigit;
            n=n/10;
        }
        if(reverseNo==temp){
            System.out.println("Pallindrom");
        }else {
            System.out.println("Not Pallindrome");
        }
    }
}
