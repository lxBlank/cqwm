package org.example;

public class m53 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int index = 0;
        int max = nums[0];
        while (index < nums.length && nums[index] <= 0){
            if(nums[index] > max){
                max = nums[index];
            }
            index++;
        }
        if(nums.length == index)
            return max;
        int count = 0;
        int maxConut = 0;
        int preConut = 0;
        while (index < nums.length) {
            if(maxConut + nums[index] > 0){
                maxConut += nums[index];
            }
            else{
                maxConut = 0;
            }
            if(maxConut > preConut){
                preConut = maxConut;
            }
            index++;
        }
        return preConut;
    }

}
