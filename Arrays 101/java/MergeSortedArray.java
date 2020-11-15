class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       int mergedArr[] = nums1.clone();
       int i = 0, j = 0, k = 0;
       while(i < m && j < n){
           if(mergedArr[i] <= nums2[j]){
               nums1[k] = mergedArr[i];
               i++;
           } else{
               nums1[k] = nums2[j];
               j++;
           }
           k++;
       }
       while(i < m){
           nums1[k] = mergedArr[i];
           i++;
           k++;
       }
       while(j < n){
          nums1[k] = nums2[j];
           j++;
           k++;
       }

    }
}