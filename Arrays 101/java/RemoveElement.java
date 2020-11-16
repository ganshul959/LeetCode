class Solution {
    public int removeElement(int[] nums, int val) {
        int noOfOccurences = 0;
        for(int i = 0 , k = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }else{
                noOfOccurences++;
            }
        }
        return (nums.length - noOfOccurences);
    }
}