class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int j = 0;
        long totalRound = 0;

        for(int i = 0; i < chalk.length; i++){
            totalRound += chalk[i];
        }

        k = (int)( k % totalRound );

        while(k >= chalk[j]){
            k -= chalk[j];
            j++;
        }

        return j;
        
    }
}