class Solution {
    int steps = 0;
    public int numberOfSteps (int num) {
        if(num == 0)return steps;

        if(num%2 != 0){
            num = num -1;
            steps++;
            numberOfSteps(num);
        }else{
            num = num/2;
            steps++;
            numberOfSteps(num);
        }
        return steps;
    }
}