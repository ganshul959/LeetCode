/*
The straightforward way to find out the result is: SUM(1 to N) - SUM(nums).
Mathematically, SUM(1 to N) = N * (N + 1) / 2
However, what if SUM(1 to N) overflows or you don't memorize/know the mathematical formula?
Turns out that, we can determine Sum(1 to N) while iterating through the array. It is nothing
but the summation of all the 1-based indices.
[Java] O(N) time, O(1) memory - no mathematical formula, no bit operation
The code follows:
 */

public int missingNumber(int[] nums) {
    int result = 0;
    for(int i = 0; i < nums.length; i++){
        result += (i + 1 - nums[i]);
    }
    return result;
}

public int missingNumber(int[] nums){ //xor
    int res=nums.length;
    for(int i=0;i<nums.length;i++){
        res^=i;
        res^=nums[i];
    }
    return res;
}

public int missingNumber(int[] nums){ //sum
    int len=nums.length;
    int sum=(0+len)*(len+1)/2;
    for(int i=0;i<len; i++)
        sum-=nums[i];
    }
    return sum;
}

public int missingNumber(int[] nums){ //binary search
    Arrays.sort(nums);
    int left=0,right=nums.length,mid=(left+right)/2;
    while(left<right){
        mid=(left+right)/2;
        if(nums[mid]>mid)right=mid;
        else left=mid+1;
    }
    return left;
}
// Summary:If the array is in order, I prefer Binary Search method. Otherwise, the XOR method is better.