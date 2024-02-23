class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstNumIndex = 0;
        int secondNumIndex = 0;
        HashMap<Integer,Integer> NumIndexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            

            int compliment = target - nums[i];
            
            
            if(NumIndexMap.containsKey(compliment)){
                firstNumIndex = i;
                secondNumIndex = NumIndexMap.get(compliment);
                break;

            }
            NumIndexMap.put(nums[i], i);
            
            
        }
        int[] answer = {firstNumIndex, secondNumIndex};
        return answer;
        

        }
        
    }
