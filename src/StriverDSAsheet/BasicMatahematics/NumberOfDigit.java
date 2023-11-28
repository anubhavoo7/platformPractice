package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

import static java.lang.Math.log10;

public class NumberOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        NumberOfDigits(n);
    }
    static void NumberOfDigits(int n){

//        int count=0;
//        while(n>0){
//            int lastDigit=n%10;
//            count =count+1;
//            n=n/10;
//        }

        int count=(int) log10(n)+1;
//        ==>> Here log base 10 of "example"->(7789) the answer will be 3.189......
//        and if we add 1 to it will be 4.189....something.
//         and if we convert it into integer --> (int)(4.189...) it will == 4;
//
        System.out.println(count);
    }
}
