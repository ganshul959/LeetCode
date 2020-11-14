class Solution {
    public int findNumbers(int[] nums) {

        int evenNumberOfDigits = 0;
        for(int currentElement : nums){
            if(Integer.toString(currentElement).length()%2 == 0){
                evenNumberOfDigits++;
            }
        }
        return evenNumberOfDigits;
    }
}