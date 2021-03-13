class Solution {   // Time complexity 2^n very bad as it is brute force
    int ways = 0;
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        findTargetWays(nums,0,0,S);
        return ways;
    }

    private void findTargetWays(int [] nums , int i , int sum , int S){
        if(i == nums.length){
            if(sum == S)
                ways++;
        }else{
            findTargetWays(nums , i+1 , sum + nums[i] , S);
            findTargetWays(nums , i+1 , sum - nums[i] , S);
        }
        return;
    }
}