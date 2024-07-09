class Solution {
    public double averageWaitingTime(int[][] customers) {

        int movingtime = 0;
        long timewaited = 0;

        for(int i = 0; i < customers.length; i++){

                if(movingtime < customers[i][0]){
                    movingtime = customers[i][0];
                }

                timewaited += customers[i][1] + movingtime - customers[i][0];

                movingtime += customers[i][1];
        }

        
        return ((double)timewaited) / customers.length;
    }
}