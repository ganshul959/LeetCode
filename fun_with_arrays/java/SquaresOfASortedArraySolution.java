class Solution {
    public int[] sortedSquares(int[] A) {

        int n = A.length;
        int res[] = new int[n];
        int left = 0;
        int right = n-1;
        int index = n-1;
        while(left <= right){
            int leftSquare = A[left]*A[left];
            int rightSquare = A[right]*A[right];
            if(leftSquare>rightSquare){
                res[index--] = leftSquare;
                left++;
            }else{
                res[index--] = rightSquare;
                right--;
            }
        }
        return res;
    }
}