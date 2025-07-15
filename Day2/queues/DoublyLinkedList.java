public class DoublyLinkedList {
    private QNode head;

    public void insertEnd(int value) {
        QNode newNode = new QNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        QNode current = head;
        while (current.next != null)
            current = current.next;

        current.next = newNode;
        newNode.prev = current;
    }

    public void delete(int value) {
        DNode current = head;
        while (current != null && current.data != value)
            current = current.next;

        if (current == null) return;

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;

        if (current.next != null)
            current.next.prev = current.prev;
    }

    public void printForward() {
        System.out.print("DoublyLinkedList (forward): ");
        QNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertEnd(5);
        list.insertEnd(10);
        list.insertEnd(15);
        list.printForward();
        list.delete(10);
        list.printForward();
    }
}