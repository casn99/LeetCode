class Solution {
    public int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

    public void infect(int[][] r, int i, int j){
        int currentScore = r[i][j];
        if(r[i][j] == -1){
            return;
        }
        for(int[] d : directions){

            int x = i + d[0];
            int y = j + d[1];
            
            if(x < 0 || y < 0 || x >= r.length || y >= r[i].length){
                continue;
            }

            if(r[x][y] > currentScore + 1){
                r[x][y] = currentScore + 1;
                infect(r, x, y);
            }

        }

    }
    public void wallsAndGates(int[][] rooms) {

        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                if(rooms[i][j] == 0){
                    infect(rooms, i, j);
                }
            }
        }
    }
}