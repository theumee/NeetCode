package ArraysAndHashmaps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }

    public static boolean containsDuplicatePartTwo(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2 ; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2,1,2,3}));
        System.out.println(containsDuplicatePartTwo(new int[]{1,2,3}));
    }
}
