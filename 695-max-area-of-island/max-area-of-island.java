class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){

                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, countAndRemoveIsland(i,j, grid));
                }
                
            }
        }

        return maxArea;




    }

    public int countAndRemoveIsland(int x, int y, int[][] grid){
        int temp = 0;
        
        if(grid[x][y] == 0){
            return temp;
        }

        grid[x][y] = 0;
        temp++;

        if(x - 1 >= 0 && grid[x - 1][y] == 1){
            temp += countAndRemoveIsland(x -1 , y, grid);
            
        }
        if(y - 1 >= 0 && grid[x][y - 1] == 1){
            temp += countAndRemoveIsland(x, y -1, grid);
            
        }
        if(x + 1 <= grid.length - 1 && grid[x + 1][y] == 1){
            temp +=countAndRemoveIsland(x + 1,y ,grid);
        }
        if(y + 1 <= grid[x].length -1 && grid[x][y + 1] == 1){
            temp += countAndRemoveIsland(x, y + 1, grid);
        }

        return temp;
    }
    
}
