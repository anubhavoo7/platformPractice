import java.util.Scanner;

public class TwoSum {
//    *# the commented logic is for leetcode hackerrank #*
//
//        for(int j=0;j<nums.length;j++){
//            for(int k=j+1;k<nums.length;k++){
//                if(nums[j]+nums[k]==target){
//                    int ab[]={j,k};
//                    return ab;
//                }
//            }
//        }
//    return null;
//    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = r.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt();
        }
        System.out.println("Enter target:");
        int target = r.nextInt();

        findTwoSumIndices(nums, target);
    }

    public static void findTwoSumIndices(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] + nums[k] == target) {
                    System.out.println("Indices: " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println("No two elements sum up to the target.");
    }

}
