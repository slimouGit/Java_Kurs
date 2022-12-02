package Challenges;

import java.util.*;

public class TwoSum {

    private static int[] findTwoSum(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();
        int[] resultNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (numList.contains(target - nums[i])) {
                resultNums[0] = numList.indexOf(target - nums[i]);
                resultNums[1] = i;
            } else {
                numList.add(nums[i]);
            }
        }
        return resultNums;
    }

    public static void main(String[] args){
        int[] nums = {4,2,7,11,15};
        int target = 9;
        int[] solution = findTwoSum(nums,target);
        System.out.println(solution[0]+" "+solution[1]);
    }


}
