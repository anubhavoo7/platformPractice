package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

public class PrimeNumbr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=primeNumber(n);
        System.out.println(isPrime);

    }
    public static boolean primeNumber(int n){
//        int count=0;
//        for(int i=1;i<=n;i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//            if(count==2){
//                System.out.println("It is a prime number!");
//                return true;
//            }else {
//                System.out.println("Its not a prime number.");
//                return false;
//            }

//        *******########## using Sq root method ########*********

                    int count=0;
                    for(int i=1;i*i<=n;i++){
                        if(n%i==0){
                            count++;
                            if((n/i)!=i) count++;
                        }

                    }
        if(count==2) return true;
        else return false;

    }
}
