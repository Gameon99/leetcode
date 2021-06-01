class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        
        int rows = grid.length;
        int columns = grid[0].length;
        
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < columns;j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    setBoundaries(i, j, grid);
                }
            }
        }
        return count;
    }
    
    public void setBoundaries(int row, int column, char[][] grid){
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == '0'){
            return;
        }
        grid[row][column] = '0';
        setBoundaries(row-1, column, grid);
        setBoundaries(row+1, column, grid);
        setBoundaries(row, column-1, grid);
        setBoundaries(row, column+1, grid);
        
    }
}
