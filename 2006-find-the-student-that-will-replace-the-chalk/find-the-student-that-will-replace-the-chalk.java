class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int j = 0;
        long totalRound = 0;

        //figures out how many units used in one cycle
        for(int i = 0; i < chalk.length; i++){
            totalRound += chalk[i];
        }

        //skip the max amounts of cycles
        //will return an amount measurable in one cycle
        k = (int)(k % totalRound);

        while(k >= chalk[j]){
            k -= chalk[j];
            j++;
        }

        return j;
        
    }
}