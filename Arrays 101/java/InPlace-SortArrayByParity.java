class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int temp;
        for(int j =0 ;j<A.length;j++){
            if(A[j]%2 == 0){
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
                i++;
            }
        }
        return A;
    }
}