package StriverDSAsheet;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();

        if(marks<=25){
            System.out.println("Fail!");
        }

            else if (marks>=25){
                System.out.println("pass..");
            }
        }
    }
