
public class CircularLinkedList {
    private CNode last;

    public void insert(int value) {
        CNode newNode = new CNode(value);
        if (last == null) {
            last = newNode;
            last.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    public void printList() {
        if (last == null) {
            System.out.println("CircularLinkedList is empty");
            return;
        }

        System.out.print("CircularLinkedList: ");
        CNode current = last.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList clist = new CircularLinkedList();
        clist.insert(100);
        clist.insert(200);
        clist.insert(300);
        clist.printList();
    }
}