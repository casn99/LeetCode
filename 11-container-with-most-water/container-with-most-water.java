class Solution {
    public int maxArea(int[] heights) {
        int width;

        int left = 0;
        int right = heights.length -1;
        int maxWater = -1;
        int tempWater = 0;


        while(left < right){
            tempWater = Math.min(heights[left], heights[right]) * (right - left);
            maxWater = Math.max(maxWater, tempWater);

            if(heights[left] > heights[right]){
                right--;
            }else{
                left++;
            }
        }

        
                
         
        
        return maxWater;
    }
}
