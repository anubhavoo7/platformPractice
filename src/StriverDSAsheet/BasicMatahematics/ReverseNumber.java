package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverseNo=0;
        while(n!=0){
            int lastDigit=n%10;
            n=n/10;
//            Handelling the  int overflow
            if(reverseNo>Integer.MAX_VALUE/10||reverseNo==Integer.MAX_VALUE/10 && lastDigit>7){
                return;
            }
//            handelling Integer UnderFlow
            if(reverseNo<Integer.MIN_VALUE/10||reverseNo==Integer.MIN_VALUE/10 && lastDigit<-8){
                return;
            }
            reverseNo=(reverseNo*10)+lastDigit;
        }
        System.out.println(reverseNo);
    }
}
