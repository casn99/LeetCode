class Solution {

    private int FRESH = 1;
    private int ROTTEN = 2;
    private boolean infect(int x, int y, int[][] g){
        if(isFresh(x,y,g)){
            g[x][y] = 2;
            return true;
        }
        return false;
        
    }


    private boolean isFresh(int x, int y, int[][] g){
        if(g[x][y] == FRESH){
            return true;
        }   
            return false;
    }

    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int time = 0;
        Queue<int[]> rotten = new LinkedList<>();



        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                int num = grid[i][j];
                if(num == FRESH){
                    fresh++;
                }else if(num == ROTTEN){
                    rotten.offer(new int[]{i,j});
                }
            }
        }

        while(fresh > 0 && rotten.size() > 0){
            int len = rotten.size();
            while(len > 0){
                int[] c = rotten.poll();

                int i = c[0];
                int j = c[1];

                if(i > 0 && isFresh(i-1,j,grid)){
                    if(infect(i-1,j,grid)){
                        rotten.offer(new int[]{i-1,j});
                        fresh--;
                    }
                }
                if(j > 0 && isFresh(i,j-1,grid)){
                    if(infect(i,j-1,grid)){
                        rotten.offer(new int[]{i,j-1});
                        fresh--;
                    }
                }
                if(i < grid.length -1&& isFresh(i+1,j,grid)){
                    if(infect(i+1,j,grid)){
                        rotten.offer(new int[]{i+1,j});
                        fresh--;
                    }
                }
                if(j < grid[i].length -1&& isFresh(i,j+1,grid)){
                    if(infect(i,j+1,grid)){
                        rotten.offer(new int[]{i,j+1});
                        fresh--;
                    }
                }



                len--;
            }

            time++;
        }


        if(fresh > 0){
            return -1;
        }else{
            return time;
        }

    }
}