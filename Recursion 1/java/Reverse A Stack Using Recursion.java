public class Solution {
    public int[] solve(int[] A) {
        Stack<Integer> stack  = new Stack<>();
        for(int i = 0; i < A.length; i++){
            stack.push(A[i]);
        }
        recursion(stack);
        for(int i = stack.size()-1 ; i >= 0 ;i--){
            A[i] = stack.pop();
        }
        return A;
    }
    private void recursion(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        recursion(stack);
        insertAtBottom(stack, top);

    }

    private void insertAtBottom(Stack<Integer> stack, int top){
        if(stack.isEmpty()){
            stack.push(top);

        }else{
            int temp = stack.pop();
            insertAtBottom(stack, top);
            stack.push(temp);
        }

    }
}
