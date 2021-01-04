class Solution {
    public int heightChecker(int[] heights) {

        int newArr[] = heights.clone();
        Arrays.sort(heights);
        int minDifference = 0;

        for(int i = 0; i < heights.length ; i++){
            if(newArr[i] != heights[i]){
                minDifference++;
            }
        }
        return minDifference;
    }
}