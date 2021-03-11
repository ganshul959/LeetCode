class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = nums.length +1;
        int sum = 0;
        int left = 0;

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            while(sum >= target){
                minLen = Math.min(minLen,i+1-left);
                sum -=nums[left++];
            }
        }
        return minLen == nums.length+1 ? 0 : minLen;
    }

}