package MountBlue;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=1;
        int n2=2;
        int n3;
        System.out.println(n1+" "+n2);
        System.out.println("enter the limit of the number up to which you want to find the fibonacci series: ");
        int count=sc.nextInt();
        for(int i=2;i<count;++i){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;

        }
    }
}
