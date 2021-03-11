class Solution { time Comlexity --O(n) Space Complexity - O(1) - Using Two pointers
    public int[] dailyTemperatures(int[] T) {
        int i = 1 , j = 0;
        int len = T.length;

        while(j < len){
            if(i < len && T[j] < T[i]){
                T[j] = i-j;
                j++;
                i = j + 1;
            }else if(i == len){
                T[j] = 0 ;
                j++;
                i = j+1;
            }else{
                i++;
            }
        }
        T[len -1 ] = 0;
        return T;
    }
}