class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                if(grid[i][j] == '1'){
                    numOfIslandsBFS(grid , i , j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
    private void numOfIslandsBFS(char [][] grid ,int i ,int j){
        int [][] directions = { {0,-1} , {0,1} , {-1,0} , {1,0} };
        int n = grid.length;
        int m = grid[0].length;

        Queue<int []>queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        grid[i][j] = '0';
        while(queue.size() > 0){
            int [] position = queue.poll();
            for(int [] dir : directions){
                int x = position[0] + dir[0];
                int y = position[1] + dir[1];
                if(x >= 0 && x < n && y >=0 && y < m){
                    if(grid[x][y] == '1'){
                        queue.offer(new int[] {x,y});
                        grid[x][y] = '0';
                    }
                }
            }
        }
    }
}