package StriverDSAsheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

//        _____*****###### Using Scanner class ######*********---------
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to take as input");
        int x=sc.nextInt();
        System.out.println("input number x= "+x);

//        --------****##### Using InputStreamReader and BufferReader ######**********------
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(input);
        int y=Integer.parseInt(reader.readLine());
        System.out.println("the number is= "+y);
    }
}
