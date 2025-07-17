public class PriorityQueueUsingHeap {
    private MinHeap heap;

    public PriorityQueueUsingHeap() {
        heap = new MinHeap();
    }

    public void enqueue(int val) {
        heap.insert(val);
    }

    public int dequeue() {
        return heap.extractMin();
    }

    public static void main(String[] args) {
        PriorityQueueUsingHeap pq = new PriorityQueueUsingHeap();
        pq.enqueue(10);
        pq.enqueue(5);
        pq.enqueue(15);

        System.out.println("Dequeued: " + pq.dequeue()); // 5
        System.out.println("Dequeued: " + pq.dequeue()); // 10
    }
}
