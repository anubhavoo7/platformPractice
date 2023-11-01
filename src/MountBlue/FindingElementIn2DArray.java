package MountBlue;

import java.util.Scanner;

public class FindingElementIn2DArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int col=sc.nextInt();

        int[][] numbers=new int[rows][col];

        //taking input
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        //taking random element to find in array
        int x=sc.nextInt();

//        //finding the element
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.println("The cordinates of the element is: "+ i+j);
                }

                }
            }
        }
    }


