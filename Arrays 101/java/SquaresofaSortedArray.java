class Solution {    // Time complexity O(n) as we aren't using any sorting algo here instead we are comparing on already sorted array
    public int[] sortedSquares(int[] nums) {

        int high = nums.length-1;
        int low = 0;
        int result[]  = new int [nums.length];

        for(int j = nums.length-1; j >= 0;j--){
            if(Math.abs(nums[high]) >= Math.abs(nums[low])){
                result[j] = nums[high]*nums[high];
                high--;
            }else{
                result[j] = nums[low]*nums[low];
                low++;
            }
        }
        return result;

    }
}