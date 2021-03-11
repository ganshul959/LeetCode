/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation. PostFix Notation a + b -> ab+
Valid operators are +, -, *, /. Each operand may be an integer or another expression.
Note:
Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.

Input: ["2", "1", "+", "3", "*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
 */
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < tokens.length ; i++){
            if("+-*/".contains(tokens[i])){
                int b = stack.pop();
                int a = stack.pop();

                switch (tokens[i]) {
                    case "+": stack.push(a+b);
                        break;
                    case "-": stack.push(a-b);
                        break;
                    case "*": stack.push(a*b);
                        break;
                    case "/": stack.push(a/b);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}