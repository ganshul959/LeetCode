class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int lastMaxConsecutive = 0;
        int currentMaxConsecutive = 0;


        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 1) {
                currentMaxConsecutive++;
            }
            if(nums[i] == 0) {
                if(currentMaxConsecutive > lastMaxConsecutive) {
                    lastMaxConsecutive = currentMaxConsecutive;
                }
                currentMaxConsecutive = 0;
            }
        }
        return currentMaxConsecutive > lastMaxConsecutive ? currentMaxConsecutive : lastMaxConsecutive;
    }
}