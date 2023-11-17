package StriverDSAsheet;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] a={2,3};
        int ch= sc.nextInt();
        System.out.println("output: "+areaSwitchCase(ch,a));
    }
    public static double areaSwitchCase(int ch, double[] a){
        double area=0;
        switch(ch){
            case 1:
                area=Math.PI*a[0]*a[0];
                break;
            case 2:
                area=a[0]*a[1];
        }
        return area;
    }
}
