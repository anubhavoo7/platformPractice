package MountBlue;

import java.util.Scanner;

public class PrintElementsInSpiralIn2DArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row and Column: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] numbers=new int[rows][cols];

        System.out.println("enter elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //for spiral output:

        int rowStart=0;
        int rowEnd=rows-1;
        int colStart=0;
        int colEnd=cols-1;


        while(rowStart<=rowEnd && colStart<=colEnd){

            for(int col=colStart;col<=colEnd;col++){
                System.out.print(numbers[rowStart][col]+" ");
            }
            rowStart++;

            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(numbers[row][colEnd]+" ");
            }
            colEnd--;

            for (int col=colEnd;col>=colStart;col--){
                System.out.print(numbers[rowEnd][col]+" ");
            }
            rowEnd--;

            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(numbers[row][colStart]+" ");
            }
            colStart++;
        }

    }
}
