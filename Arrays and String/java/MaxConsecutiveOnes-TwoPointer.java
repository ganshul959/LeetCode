class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int k = 0;
        for(int i = 0 ;i < nums.length ;i++){
            if(nums[i] == 0){
                maxOnes = Math.max(maxOnes,k);
                k = 0;
            }else{
                k++;
            }
        }
        maxOnes = Math.max(maxOnes,k);
        return maxOnes;
    }
}