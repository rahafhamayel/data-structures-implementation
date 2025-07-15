public class QueueUsingLinkedList {
    private Node front, rear;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        front = front.next;
        if (front == null) rear = null;
    }
    public int peek() {
        if (front == null)
            throw new IllegalStateException("Queue is empty");
        return front.data;
    }

    public void printQueue() {
        System.out.print("QueueUsingLinkedList: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        System.out.println("Front: " + q.peek());
    }
}