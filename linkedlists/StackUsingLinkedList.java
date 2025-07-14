package linkedlists;

public class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        top = top.next;
    }

    public int peek() {
        if (top == null) throw new IllegalStateException("Stack is empty");
        return top.data;
    }

    public void printStack() {
        System.out.print("StackUsingLinkedList: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(100);
        s.push(200);
        s.push(300);
        s.printStack();
        s.pop();
        s.printStack(); // 200 100
        System.out.println("Top: " + s.peek());
    }
}
