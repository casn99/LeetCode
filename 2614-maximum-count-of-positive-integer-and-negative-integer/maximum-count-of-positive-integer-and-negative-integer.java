class Solution {
    public int maximumCount(int[] nums) {
        
        int i = 0;
        int j = 0;
        while(i < nums.length && nums[i] < 0){
            i++;
        }
        while(i < nums.length && nums[i] == 0){
            i++;
            j++;
        }
        return Math.max(i-j, nums.length -i);
        
    }
}