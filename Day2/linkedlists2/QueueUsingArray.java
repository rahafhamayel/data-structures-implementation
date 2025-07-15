public class QueueUsingArray {
    private int[] queue;
    private int front ;
    private int rear;
    private int size;
    private intcapacity;
    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = -1;
    }
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }

    public int peek() {
        if (size == 0)
            throw new IllegalStateException("Queue is empty");
        return queue[front];
    }

    public void printQueue() {
        System.out.print("QueueUsingArray: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        System.out.println("Front: " + q.peek());
    }
}
