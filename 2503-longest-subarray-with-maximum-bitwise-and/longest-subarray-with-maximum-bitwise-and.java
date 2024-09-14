class Solution {
    public int longestSubarray(int[] nums) {
        int maxRepeat = 0;
        int currentRepeat = 0;
        int maxVal = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == maxVal){
                currentRepeat++;
                maxRepeat = Math.max(currentRepeat, maxRepeat);
            } else if(nums[i] > maxVal){
                maxRepeat = 1;
                currentRepeat = 1;
                maxVal = nums[i];
            } else {
                currentRepeat = 0;
            }
        }
        return maxRepeat;
    }
}