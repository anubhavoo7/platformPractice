package StriverDSAsheet;

import java.util.Scanner;

public class fibonacciSeries2 {
//    ******######### give the fibonacci number at a specific postion.#######***********


        public static void main(String[] args) {


            /* Your class should be named Solution.
             * Read input as specified in the question.
             * Print output as specified in the question.
             */
            Scanner sc=new Scanner(System.in);
            int n1=1;
            int n2=1;
            int n3=0;
            int count=sc.nextInt();
            int result = fibonacciSeries(n1, n2, n3, count);
            System.out.println(result);
        }
        public static int fibonacciSeries(int n1,int n2, int n3, int count){
            if(count==1){
                return n1;
            }else if(count==2){
                return n2;
            }
            for(int i=3;i<=count;i++){ //i=3 because we have 1 and 1 in 1st and 2nd position and
                //we start calculating fibonacci number from 3rd postion.
                //and we calculate untill the Count.
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            return n3;

        }

    }


