package StriverDSAsheet;

import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args) {
        System.out.println("enter the data type: ");
        Scanner scanner=new Scanner(System.in);
       String types = scanner.nextLine();
        System.out.println("you entered: "+types);
        System.out.println(dataTypes(types));
    }
        static int dataTypes (String types){
            if (types.equals("Integer")) return 4;
            else if(types.equals("Long")) return 8;
            else if(types.equals("Float")) return 4;
            else if (types.equals("Double"))return 8;
            else if(types.equals("Character")) return 1;
                else return -1;
        }
    }

