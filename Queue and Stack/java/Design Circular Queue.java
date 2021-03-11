class MyCircularQueue {
    int q [];
    int front,rear;
    int length;

    public MyCircularQueue(int k) {
        q = new int[k];
        front = 0;
        rear = -1;
        length = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear = (rear + 1)%q.length;
        q[rear] = value;
        length++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }else{
            front = (front + 1)%q.length;
            length--;
            return true;
        }
    }

    public int Front() {
        return isEmpty() ? -1 : q[front];
    }

    public int Rear() {
        return  isEmpty() ? -1 : q[rear];
    }

    public boolean isEmpty() {
        if(length == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull() {
        if(length == q.length){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */