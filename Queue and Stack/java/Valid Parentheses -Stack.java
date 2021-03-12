class Solution {
    public boolean isValid(String s) {

        Stack <Character> stack = new Stack();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if(stack.empty()){
                stack.push(ch);
            }else if(ch == ')'){
                if(stack.peek() == '(')
                    stack.pop();
                else
                    stack.push(ch);
            }else if(ch == ']'){
                if(stack.peek() == '[')
                    stack.pop();
                else
                    stack.push(ch);
            }else if(ch == '}'){
                if(stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
}