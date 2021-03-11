class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == '1'){
                    numsIslandsDFS(grid,i,j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }

    private void numsIslandsDFS(char[][] grid ,int i , int j){

        if(i < 0 || j < 0)return;
        if(i >= grid.length || j >= grid[i].length || grid[i][j] =='0')return;

        grid[i][j] = '0';
        numsIslandsDFS(grid,i+1,j);
        numsIslandsDFS(grid,i-1,j);
        numsIslandsDFS(grid, i,j+1);
        numsIslandsDFS(grid, i,j-1);
    }
}