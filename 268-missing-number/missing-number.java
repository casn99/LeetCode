class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int targetsum = 0;
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                targetsum += i;
            }
            targetsum += nums.length;

        return targetsum - sum;
    }
}