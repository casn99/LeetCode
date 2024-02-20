class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newnums = new int[nums.length];
        int increment = 0;
        int i = 0;
        int j = n;
        while(increment != nums.length){
            newnums[increment] = nums[i];
            increment++;
            i++;
            newnums[increment] = nums[j];
            j++;
            increment++;
        }
        return newnums;
    }
}