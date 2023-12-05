package StriverDSAsheet.BasicMatahematics;

import java.util.Scanner;

public class SumOfAllDevisers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
//        System.out.println(n);
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                sum=sum+i;
//                System.out.println(sum);
//            }
//        }

        }
    public static int sum(int n){
        int num=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                num=num+i;
            }
        }
        System.out.println(num);
        return num;

    }
}
