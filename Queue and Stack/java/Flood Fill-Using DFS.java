class Solution { // Using DFS 100% ahead of all other submission.
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if(image[sr][sc] == newColor)return image;

        fill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }

    private void fill(int [][] image , int i , int j , int baseColor , int newColor){
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != baseColor){
            return;
        }
        image[i][j] = newColor;
        fill(image, i+1 , j , baseColor , newColor);
        fill(image, i-1 , j , baseColor , newColor);
        fill(image, i , j+1 , baseColor , newColor);
        fill(image, i , j-1 , baseColor , newColor);
    }
}