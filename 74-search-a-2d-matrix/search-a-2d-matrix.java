class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int currentX = 0;
        int currentY = 0;

        int y = matrix.length;
        int x = matrix[0].length;
        boolean notFound = true;

        while(notFound){
            if(matrix[currentY][currentX] == target){
                break;
            }else if(matrix[currentY][currentX] > target){
                return false;
            }




            if(currentY + 1 < y && matrix[currentY + 1][currentX] <= target){
                currentY++;
            }else if(currentX + 1 < x){
                currentX++;
            }else{
                return false;
            }
        }
        return true;
    }
}
