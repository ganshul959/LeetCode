class Solution {
    public void duplicateZeros(int[] arr) {

        int length = arr.length;
        int newArray[] = arr.clone();

        for(int i = 0,j = 0;i < length && j < length ;i++, j++){
            if(newArray[i] == 0){
                arr[j]=0;
                j++;
                if(j<length){

                    arr[j]=0;
                }
            } else{
                arr[j] = newArray[i];
            }
        }
    }
}
}