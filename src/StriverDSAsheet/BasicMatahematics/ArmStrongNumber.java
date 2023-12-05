package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

public class ArmStrongNumber {





        public static void main(String[] args) {
            // Write your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            boolean isArmstrong = ArmstrongNumber(n);
            System.out.println(isArmstrong);
        }
        public static boolean ArmstrongNumber(int n){
            int sum=0;
            int temp=n;
            while(n>0){
                int lastDigit=n%10;

                n=n/10;
                sum=sum+(lastDigit*lastDigit*lastDigit);
            }
            return temp == sum;

        }
    }
