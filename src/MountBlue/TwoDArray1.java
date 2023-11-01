package MountBlue;

import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows= scanner.nextInt();
        int col= scanner.nextInt();

        int[][] numbers=new int[rows][col];
        //Taking Input
        //--outer loop controles rows
        for(int i=0;i<rows;i++){
            //--inner loop controles coloumns
            for(int j=0;j<col;j++){
                numbers[i][j]=scanner.nextInt();
            }
        }

        //Output
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
