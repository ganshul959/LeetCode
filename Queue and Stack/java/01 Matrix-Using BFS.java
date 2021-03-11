class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int []> queue = new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int [][] directions = {{0,1} , {0,-1} , {-1,0} , {1,0}};
        while(!queue.isEmpty()){
            int cell[] = queue.poll();
            for(int [] dir : directions){
                int x = dir[0] + cell[0];
                int y = dir[1] + cell[1];

                if(x >=0 && x < n && y >=0 && y < m){
                    if(matrix[x][y] > matrix[cell[0]][cell[1]]+1){
                        matrix[x][y] = matrix[cell[0]][cell[1]]+1;
                        queue.offer(new int[]{x,y});
                    }
                }
            }
        }
        return matrix;
    }
}