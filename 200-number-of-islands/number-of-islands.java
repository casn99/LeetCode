class Solution {

    private int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int numIslands = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    eliminateIsland(i, j, grid);
                    numIslands++;
                }
            }
        }



        return numIslands;
    }

    private void eliminateIsland(int x, int y, char[][] g){

        g[x][y] = '0';
        
        for(int[] d : directions){
            int i = x + d[0];
            int j = y + d[1];

            if(i < 0 || j < 0 || i > g.length-1 ||j > g[i].length-1 || g[i][j] == '0'){
                continue;
            }else{
                eliminateIsland(i, j, g);
            }

        }

        return;
    }

}