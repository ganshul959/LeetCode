class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int popItem = q1.poll();
        swap();
        return popItem;
    }

    /** Get the top element. */
    public int top() {
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int top = q1.peek();
        q2.offer(q1.poll());
        swap();
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

    private void swap(){
        Queue<Integer> temp = q1;
        q1 =q2;
        q2 = temp;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */