class Solution {
    public int arrayPairSum(int[] nums) {

        int i = 0;
        int maximized  = 0;
        Arrays.sort(nums);

        while(i < nums.length -1){
            maximized += nums[i];
            i = i + 2;
        }
        return maximized;
    }
}