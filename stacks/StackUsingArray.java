package stacks;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }

    public int peek() {
        if (top == -1) throw new IllegalStateException("Stack is empty");
        return stack[top];
    }

    public void printStack() {
        System.out.print("StackUsingArray: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack();
        s.pop();
        s.printStack();
        System.out.println("Top: " + s.peek());
    }
}
