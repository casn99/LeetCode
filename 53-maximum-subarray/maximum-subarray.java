class Solution {
    public int maxSubArray(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        int runningCount = 0;
        for(int n : nums){
            if(runningCount <0){
                runningCount =0;
            }
            runningCount += n;

            globalMax = Math.max(globalMax, runningCount);
        }

        return globalMax;
    }
}