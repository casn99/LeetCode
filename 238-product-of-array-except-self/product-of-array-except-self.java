class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        int total = 1;
        int totalClean = 1;
        int zeros = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){   
                totalClean *= nums[i];
            }else{
                zeros++;
            }
                total *= nums[i];

        }

        for(int i = 0; i < nums.length; i++){
            if(zeros > 1){
                result[i] = 0;
            }else if(nums[i] == 0){
                result[i] = totalClean;
            }else{
                result[i] = total / nums[i];
            }
        }

        return result;
    }
}