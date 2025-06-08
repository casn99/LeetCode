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
            int c = x  + d[0];
            int u = y + d[1];
            if(c < 0 || u < 0 || c >= g.length || u >= g[x].length){
                continue;
            }
            eliminateIsland(g, c, u);
            
        }
    }

 
    
}