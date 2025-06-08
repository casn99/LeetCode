class Solution {

    private int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int numIslands = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    eliminateIsland(grid, i, j);
                    numIslands++;
                }
            }
        }

        return numIslands;
    }

    private void eliminateIsland(char[][] g, int x, int y){
        if(g[x][y] == '0'){
            return;
        }
        g[x][y] = '0';

        for(int[] d : directions){
            if(x  + d[0] < 0 || y  + d[1] < 0 || x  + d[0] >= g.length || y  + d[1] >= g[x].length){

            }else{
                eliminateIsland(g, x + d[0], y + d[1]);
            }
        }
    }

 
    
}