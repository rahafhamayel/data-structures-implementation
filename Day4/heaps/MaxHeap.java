import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    private void heapifyUp() {
        int i = heap.size() - 1;
        while (i > 0 && heap.get(i) > heap.get((i - 1) / 2)) {
            int parent = (i - 1) / 2;
            int tmp = heap.get(i);
            heap.set(i, heap.get(parent));
            heap.set(parent, tmp);
            i = parent;
        }
    }

    private void heapifyDown() {
        int i = 0;
        int size = heap.size();
        while (i < size) {
            int left = 2 * i + 1, right = 2 * i + 2;
            int largest = i;
            if (left < size && heap.get(left) > heap.get(largest)) largest = left;
            if (right < size && heap.get(right) > heap.get(largest)) largest = right;
            if (largest != i) {
                int tmp = heap.get(i);
                heap.set(i, heap.get(largest));
                heap.set(largest, tmp);
                i = largest;
            } else break;
        }
    }

    public void insert(int val) {
        heap.add(val);
        heapifyUp();
    }

    public int extractMax() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown();
        }
        return max;
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();
        h.insert(20);
        h.insert(15);
        h.insert(30);
        h.insert(40);

        System.out.println("Max: " + h.extractMax());
    }
}
