package org.example;

public class m376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        else if(nums.length == 2)
            return 2;
        int preDiff = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            int curDiff = nums[i] - nums[i - 1];
            if((preDiff <= 0 && curDiff > 0) || (preDiff >= 0 && curDiff < 0)){
                preDiff = curDiff;
                count++;
            }
        }
        return count;
    }
}
