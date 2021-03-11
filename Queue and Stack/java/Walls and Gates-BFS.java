public class Solution {
    /**
     * @param rooms: m x n 2D grid
     * @return: nothing
     */
    public void wallsAndGates(int[][] rooms) {
        // write your code here
        for(int i = 0 ; i < rooms.length ; i++){
            for(int j = 0 ; j < rooms[0].length ; j++){
                if(rooms[i][j] == 0){
                    wallsAndGatesBFS(rooms,i , j);
                }
            }
        }
    }
    private void wallsAndGatesBFS(int [][] rooms ,int  i ,int j){
        int [][] directions = {{-1,0} , {1,0} , {0,-1} , {0,1}};
        int n = rooms.length;
        int m = rooms[0].length;

        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int [] {i , j});

        while(queue.size() > 0){
            int [] position = queue.poll();
            int curr = rooms[position[0]][position[1]];
            for(int [] dir : directions){
                int x = position[0] + dir[0];
                int y = position[1] + dir[1];
                if(x >= 0 && x < n && y >= 0 && y < m && rooms[x][y] != -1 && rooms[x][y] != 0){
                    if(rooms[x][y] > curr + 1){
                        rooms[x][y] = curr + 1;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
        }
    }
}