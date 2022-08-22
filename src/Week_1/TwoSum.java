package Week_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};     // Output - [0, 1]
        int target = 9;

        System.out.println(Arrays.toString(bruteforce(nums, target)));
        System.out.println(Arrays.toString(hashmap(nums,target)));
    }

    private static int[] hashmap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    private static int[] bruteforce(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(nums[i]+nums[j]==target){
                     return new int[]{i,j};
                 }
             }
         }
         return new int[]{};
    }
}
