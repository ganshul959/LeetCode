//User function Template for Java

class Solution{
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int midSize = (sizeOfStack/2) + 1;
        solve(s,midSize);
    }

    private void solve(Stack<Integer>s, int size){
        if(size == 1){
            s.pop();
            return;
        }
        int top = s.pop();
        solve(s,size-1);
        s.push(top);
    }
}