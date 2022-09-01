package Week_2;

import java.util.Arrays;
import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement1(nums));    // Using HashMap
        System.out.println(majorityElement2(nums));    // Using sorting
    }

    private static int majorityElement2(int[] nums) {
        int n = nums.length;
         Arrays.sort(nums);
         return nums[n/2];
    }
    private static int majorityElement1(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i) && map.get(i) + 1 > nums.length/2){
                return i;
            }else{
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }
        return -1;
    }
}
