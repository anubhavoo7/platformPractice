package StriverDSAsheet;

public class doWhileLoops {
    public static void main(String[] args){
        int i=5;
        do{
            System.out.println("Count: "+i);
            i++;
        }while(i<=4);      //The loop will continue to execute as long as the condition i <= 4 is true.
        // However, since i starts at 5, the condition is already false from the beginning,
        // so the loop will only run once.


        System.out.println(i);
    }
}
