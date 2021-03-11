/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
MovingAverage m = new MovingAverage(3);
m.next(1) = 1 // return 1.00000
m.next(10) = (1 + 10) / 2 // return 5.50000
m.next(3) = (1 + 10 + 3) / 3 // return 4.66667
m.next(5) = (10 + 3 + 5) / 3 // return 6.00000
 */
public class MovingAverage {
    /*
     * @param size: An integer
     */
    double sum;
    int size;
    Queue<Integer> queue;
    public MovingAverage(int size) {
        // do intialization if necessary
        this.queue = new LinkedList<>();
        this.size = size;

    }

    /*
     * @param val: An integer
     * @return:
     */
    public double next(int val) {
        // write your code here
        queue.offer(val);
        sum =+ val;

        if(queue.size() <= size){
            return sum/queue.size();
        }

        sum =- queue.poll();
        return sum/size;
    }
}
