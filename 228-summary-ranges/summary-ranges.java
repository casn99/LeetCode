class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> orders = new ArrayList<>();

        //edge cases
        if(nums.length == 0){
            return orders;
        }
        if(nums.length == 1){
            orders.add(Integer.toString(nums[0]));
            return orders;
        }

        
        int start = nums[0];
        int end = nums[nums.length -1];
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] - 1 != nums[i-1] ){
                end = nums[i-1];
                if(start == end){
                    orders.add(Integer.toString(start));
                }else{
                    orders.add(Integer.toString(start)+ "->" + Integer.toString(end));

                }
                start = nums[i];

            }
            if(i == nums.length -1){
                end = nums[i];
                if(start == end){
                    orders.add(Integer.toString(start));
                }else{
                    orders.add(Integer.toString(start)+ "->" + Integer.toString(end));
                }
            }
        }

        return orders;
        
    }
}