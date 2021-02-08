class Solution {
    public int pivotIndex(int[] nums) {
       int[] presum = new int[nums.length +1];

        presum[0] = 0;
        /*Here we are taking previous index element sum to get current index
        sum instead of adding from start for each element
        */
        for(int i = 0;i < nums.length;i++){
            presum[i+1] = presum[i] + nums[i];
        }

        for(int i = 0;i < nums.length;i++){
            if(presum[i] == (presum[nums.length] - presum[i] - nums[i])){
                return i;
            }
        }
        return -1;
    }
}