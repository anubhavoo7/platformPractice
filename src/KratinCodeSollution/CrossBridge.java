package KratinCodeSollution;

//******#####
//        Problem Statement
//
//        While constructing a building, a worker wants to move the boxes from warehouse to the construction site, crossing the bridge in the path. The boxes have different weights. Each box has a weight in multiples of 25 (eg: 25/50/75 or 100),
//
//        Workers can carry multiple boxes at a time (given by the input parameter 'carryCapacity) & can carry a maximum combined weight given by the input parameter 'max Weight'.
//
//        For example, if carry Capacity is 3, then the worker should be able to move 3 boxes in a trip. However, if the max Weight value is 200, then the worker cannot carry a combined box weight of more than 200
//
//        Given an array int] box Weight, int carry Capacity, & int max Weight, return the minimum number of trips necessary to move all of the boxes.
//
//          Constraints
//
//                  box Weight will contain between 1 and 50 elements, inclusive.
//
//                  weights will be in multiples of 25 and 100. (25, 50, 75, 100}
//
//                  carryCapacity will be between 1 and 5, inclusive.
//
//                  max Weight - 350
//

import java.util.Arrays;

public class CrossBridge {

    public static int leastNumber(int[] boxWeight, int carryCapacity,int maxWeight){
        Arrays.sort(boxWeight);

        int trips=0; //it initialized as the trips of the worker take
        int n=boxWeight.length; //length of the array
        int i=n-1;  //index of the last element of the array
        while(i>=0){
            int remainingCapacity=maxWeight; //it shows how much more weight the worker can carre
            int j=0; //it is helping in tracking the number of boxes being carried by the person

           while(remainingCapacity>0 && j<carryCapacity && i>=0){   //The loop continues as long as all of the following conditions are true:
                                                                    //remainingCapacity > 0: There is still carrying capacity available (the worker can carry more weight).
                                                                      //j < carryCapacity: The worker has not yet reached their carrying capacity (the number of boxes they can carry at a time).
                                                                      //i >= 0: There are still boxes left to process.


                if(boxWeight[i]<=remainingCapacity){
                    remainingCapacity -= boxWeight[i];
                    i--;
                } else{
                    break;
                }
                j++;
            }
           trips++;
        }
        return trips;
    }

    public static void main(String[] args){
        int[] boxWeight={125,25,50,25 ,75,100};
        int carryCapacity=2;
        int maxWeight=150;

        int result=leastNumber(boxWeight,carryCapacity,maxWeight);
        System.out.println("minimum number of trips: "+result);
    }


}
