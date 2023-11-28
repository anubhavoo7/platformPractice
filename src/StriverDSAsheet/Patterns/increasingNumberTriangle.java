package StriverDSAsheet.Patterns;

import java.util.Scanner;

public class increasingNumberTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        *******######## General Code #######*********

//        int nums=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(nums);
//                nums=nums+1;
//            }
//            System.out.println();
//        }

//        ********######## Coding Ninja platform code ##########*********
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(num);
                } else {
                    System.out.print(" " + num);
                }

                num = num + 1;
            }
            System.out.println();
        }
    }
    }
