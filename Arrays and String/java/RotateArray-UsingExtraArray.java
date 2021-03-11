class Solution {
    public void rotate(int[] nums, int k) {
        int res[] = new int[nums.length];
        k = k % nums.length;

        for(int i = nums.length-1 ; i >= 0 ; i--){
            res[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0 ; i <nums.length ; i++){
            nums[i] = res[i];
        }
    }
}