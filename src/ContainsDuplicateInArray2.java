import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateInArray2 {

//    Q.219 in LeetCoode Contains Duplicate in array

    public static void main(String[] args){
        int nums[]={1,2,3,1};
        int k=1; //false
//        int k=2 or greater than 2 are true
         Sollution sollution=new Sollution();
        System.out.println(sollution.containsNearbyDuplicat(nums,k));


    }
    static class Sollution

    {
        public boolean containsNearbyDuplicat(int nums[],int k){
            Map<Integer, Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(!hm.containsKey(nums[i])){
                    hm.put(nums[i],i);
                }else{
                    int PastIndex=hm.get(nums[i]);
                    if(Math.abs(nums[i]-i)<=k){
                        return true;
                    } else{
                        hm.put(nums[i],i);
                    }
                }
            }
            return false;
        }

    }

}
