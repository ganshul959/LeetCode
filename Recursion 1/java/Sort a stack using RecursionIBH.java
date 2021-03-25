/ *Complete the function below*/
class GfG{
    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.

        if(s.size() == 1)
            return s;

        int lastNum  = s.pop();
        sort(s);
        insert(s,lastNum);

        return s;
    }

    private void insert(Stack<Integer> s, int lastNum){
        if(s.isEmpty() || s.peek() <= lastNum){
            s.push(lastNum);
            return;
        }

        int value = s.pop();
        insert(s,lastNum);
        s.push(value);
    }
}