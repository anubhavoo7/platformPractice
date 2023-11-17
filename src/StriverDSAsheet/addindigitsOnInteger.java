package StriverDSAsheet;

import java.util.Scanner;

public class addindigitsOnInteger {
//     ********############ add the evens and odd digits of a single integer value using while loop.**********######
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Integer number: ");
    int n=sc.nextInt();
    int sumOfEven=SumOfEvenDigits(n);
    int sumOfOdd=SumOfOddDigits(n);
    System.out.println(sumOfEven+" "+sumOfOdd);

    }
    public static int SumOfEvenDigits(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            if(digit%2==0){
                sum+=digit;
            }
            n/=10;
        }
        return sum;
    }
    public static int SumOfOddDigits(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            if(digit%2!=0){
                sum+=digit;
            }
            n/=10;
        }
        return sum;
    }
}
