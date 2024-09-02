class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int j;
        int temp = 0;
        int best = 1;
        for(int i : set){
            if(!set.contains(i-1)){
                temp = 1;
                j = i+1;
                while(set.contains(j)){
                    temp++;
                    j++;
                }
                best = Math.max(temp, best);
            }
           
        }

        //System.gc();
        return best;
        
    }
}