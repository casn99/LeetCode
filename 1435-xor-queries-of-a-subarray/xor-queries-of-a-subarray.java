class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answers = new int[queries.length];
        for(int i = 0 ; i < queries.length; i++){
            answers[i] = arr[queries[i][0]];
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(j > queries[i][0]){
                answers[i] = answers[i] ^ arr[j];
                }
            }
            
            
        }
        return answers;
    }
}