class Solution {  //Using BFS Ahead of only 50% of submissions
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int n = image.length;
        int m = image[0].length;
        int basecolor = image[sr][sc];

        if(image[sr][sc] == newColor){
            return image;
        }

        Queue<int []> queue = new LinkedList<>();
        image[sr][sc] = newColor;
        queue.offer(new int[]{sr,sc});

        int [][] directions = {{0,-1},{0,1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            int pixels[] = queue.poll();
            for(int [] dir : directions){
                int x = pixels[0] + dir[0];
                int y = pixels[1] + dir[1];

                if(x >= 0 && x < n && y >= 0 && y < m){
                    if(image[x][y] == basecolor){
                        queue.offer(new int[] {x,y});
                        image[x][y] = newColor;
                    }
                }
            }
        }
        return image;
    }
}