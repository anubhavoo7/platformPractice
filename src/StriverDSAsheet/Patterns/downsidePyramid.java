package StriverDSAsheet.Patterns;

import java.util.Scanner;

public class downsidePyramid {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }




}
