class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int temp;
        for(int j =0;j<nums.length;j++){
            if(nums[j] != val){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return i;
    }
}