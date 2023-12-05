package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

import static java.lang.Math.min;

public class GCD_HCF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int isGcd=GCD(n,m);
        System.out.println(isGcd);

    }
    public static int GCD(int n,int m){


//        ********####### brut force method #########******
//         Time complexity = O(n);
//        int gcd=0;
//        for(int i=1;i<=Integer.min(n,m);i++){
//            if((n%i==0) && (m%i==0)){
//                gcd=i;
//            }
//        }
//        return gcd;

//        *********######### for less time complexity #####********
//              Time complexity = O(min(n,m))

                     int gcd=1;

        for(int i=Integer.min(n,m);i>=1;i--){

            if((n%i==0) && (m%i==0)){
                gcd=i;
                break;
            }
        }
        return gcd;
     }
}
