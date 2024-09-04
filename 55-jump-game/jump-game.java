class Solution {
    public boolean canJump(int[] nums) {
        
        int livesLeft = nums[0];
        int currentIndex = 0;

        while(livesLeft > 0 && currentIndex < nums.length -1){
            currentIndex++;
            livesLeft = Math.max(livesLeft -1 , nums[currentIndex]);
        }

        return currentIndex == nums.length -1;
    }
}
