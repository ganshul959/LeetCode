class Solution {
    public void duplicateZeros(int[] arr) {

        int noOfZeros = 0;
        for(int currentElement : arr){
            if(currentElement == 0){
                noOfZeros++;
            }
        }

        int newArr [] = new int [arr.length + noOfZeros];
        int newElement = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                newArr[newElement++] = arr[i];
            } else{
                newElement = newElement+2;
            }
        }

        for(int i = 0;i<arr.length ;i++){
            arr[i]=newArr[i];
        }
    }
}