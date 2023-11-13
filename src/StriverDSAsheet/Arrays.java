package StriverDSAsheet;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        String[] cars=new String[n];
        System.out.println("Enter the name of cars: ");
        for(int i=0;i<n;i++){
        cars[i]=sc.next();
    }
        System.out.println("Cars are:");
        System.out.println("*****### Printing array using for loop ####*****");

//        *****### Printing array using for loop ####*****

        for (int j=0;j<cars.length;j++){
            System.out.println("Element " + (j + 1) + ": " +cars[j]);
        }

        System.out.println("*****### Printing array using forEach loop ####*****");

//        *****### Printing array using forEach loop ####*****
        for (String str:cars) {
            System.out.println("Element " + ": " +str);
        }
}
}

