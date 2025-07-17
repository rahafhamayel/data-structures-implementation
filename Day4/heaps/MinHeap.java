import java.util.ArrayList;

public class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    private void heapifyUp() {
        int index = heap.size() - 1;
        while (index > 0 && heap.get(index) < heap.get((index - 1) / 2)) {
            int parent = (index - 1) / 2;
            int tmp = heap.get(index);
            heap.set(index, heap.get(parent));
            heap.set(parent, tmp);
            index = parent;
        }
    }

    private void heapifyDown() {
        int index = 0;
        int size = heap.size();
        while (index < size) {
            int left = 2 * index + 1, right = 2 * index + 2;
            int smallest = index;
            if (left < size && heap.get(left) < heap.get(smallest)) smallest = left;
            if (right < size && heap.get(right) < heap.get(smallest)) smallest = right;
            if (smallest != index) {
                int tmp = heap.get(index);
                heap.set(index, heap.get(smallest));
                heap.set(smallest, tmp);
                index = smallest;
            } else break;
        }
    }

    public void insert(int val) {
        heap.add(val);
        heapifyUp();
    }

    public int extractMin() {
        if (heap.isEmpty()) throw new IllegalStateException("Empty Heap");
        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown();
        }
        return min;
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap();
        h.insert(5);
        h.insert(3);
        h.insert(17);
        h.insert(10);
        h.insert(84);
        h.insert(19);
        h.insert(6);
        h.insert(22);
        h.insert(9);

        System.out.println("Min: " + h.extractMin());
    }
}
