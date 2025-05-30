class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;


        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    eliminateIsland(i,j,grid);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }


    public void eliminateIsland(int x, int y, char[][] grid){

        if (x < 0 || y < 0 || x >= grid.length || 
            y >= grid[0].length || grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';


        if(x-1 >= 0 && grid[x - 1][y] == '1'){
            eliminateIsland(x-1, y, grid);
        }
        if(x+1 < grid.length   && grid[x + 1][y] == '1'){
            eliminateIsland(x+1,y, grid);
        }
        if(y + 1 < grid[x].length  && grid[x][y + 1] == '1'){
            eliminateIsland(x,y+1, grid);
        }
        if(y-1 >= 0 && grid[x][y - 1] == '1'){
            eliminateIsland(x,y-1, grid);
        }

    }


}