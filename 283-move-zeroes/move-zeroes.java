class Solution {
    public void moveZeroes(int[] nums) {
        
        int left = 0;
        //int left = nums.length - 1;
        

        for(int r = 0; r < nums.length ; r++){
        //for(int r = nums.length - 1; r >=0 ; r--){
        
            //this works because the left index saves the leftmost 0, that way we can swap it with any number to move it in line with the rest of the non zero numbers
            // 0 1 0 3 12
            // ^ saved
            // 1 0 0 3 12
            //   ^ saved
            // 1 3 0 0 12
            //     ^ saved
            // 1 3 12 0 0
            //        ^ saved

    
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[left];
                nums[left] = temp;
                left++;
            }
    /*
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[left];
                nums[left] = temp;
                left--;
            }
    */
            

        }
    }
}