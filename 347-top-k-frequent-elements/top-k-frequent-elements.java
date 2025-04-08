class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> numCount = new HashMap<>();
        PriorityQueue<Integer[]> sorted = new PriorityQueue<Integer[]>((arr1, arr2) -> arr2[1] - arr1[1]);

        for(int i = 0; i < nums.length; i++){
            numCount.put(nums[i], numCount.getOrDefault(nums[i] , 0) + 1);
        }

        for(int key : numCount.keySet()){
            Integer[] temp = {key, numCount.get(key)};
            sorted.add(temp);
        }

        for(int i =0; i < result.length; i++){
            result[i] = sorted.remove()[0];
        }

        return result;
    }
}