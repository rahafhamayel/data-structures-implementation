# data-structures-implementation
Implementations of basic data structures using java
📅 Day 1 + Day 2 + Day 3  – Completed Structures

✅ Implemented and tested:

- [x] Dynamic Array  
- [x] Singly Linked List  
- [x] Stack (using Array)  
- [x] Stack (using Linked List)  
- [x] Queue using Array  
- [x] Queue using Linked List  
- [x] Doubly Linked List  
- [x] Circular Linked List
- [x] Binary Tree  
- [x] Binary Search Tree  
- [x] Tree Traversal Algorithms (Inorder, Preorder, Postorder)
- [x] AVL Tree
- [x] Min Heap
- [x] Max Heap
- [x] Priority Queue using Heap


All files include a `main()` method for testing and are organized into appropriate folders.



The project is organized by data structure category, each placed in a separate folder for clarity and modularity. This allows for easy navigation, testing, and future scalability.

- **`arrays/`**: Contains custom implementation of dynamic arrays from scratch without relying on Java's built-in `ArrayList`. Includes core functions such as `add`, `remove`, and `get`.

- **`linkedlists/`**: Includes various types of linked lists:
  - `SinglyLinkedList`: Basic node-based list with insertion and deletion.
  - `DoublyLinkedList`: Nodes with both `next` and `prev` pointers for two-way traversal.
  - `CircularLinkedList`: A circular version of singly linked list where the last node points to the head.
  - `StackUsingLinkedList`: Stack implementation using a singly linked list.

- **`stacks/`**: Holds array-based stack implementation with fixed capacity. Supports operations like `push`, `pop`, and `peek`.

- **`queues/`**: Includes two queue implementations:
  - `QueueUsingArray`: Circular array-based queue with front/rear tracking.
  - `QueueUsingLinkedList`: Queue with dynamic memory using a linked list.

### **`trees/`**
Contains tree-related implementations including:
- `BinaryTree` and `BinarySearchTree`: Node-based structures for hierarchical data.
- Traversal algorithms:
  - `inorder`: Left → Root → Right  
  - `preorder`: Root → Left → Right  
  - `postorder`: Left → Right → Root  
Each traversal prints the tree in a different visiting order.
Each `.java` file:
- Has a standalone `main()` method for testing.
- Includes inline comments for clarity.
- Is written for educational readability, not just performance.
-AVLTree.java: Implements a self-balancing Binary Search Tree using AVL rotations (left, right, LR, RL). Supports insertion, height tracking, and in-order traversal.

### **`heaps/`**
MinHeap.java: Implements a binary heap where parent nodes are smaller than children.

MaxHeap.java: Implements a binary heap where parent nodes are larger than children.

PriorityQueueUsingHeap.java: A priority queue that uses a min-heap as backend storage. Supports insertion and polling the highest priority element.

