# data-structures-implementation
Implementations of basic data structures using java
📅 Day 1 + Day 2  – Completed Structures

✅ Implemented and tested:

- [x] Dynamic Array  
- [x] Singly Linked List  
- [x] Stack (using Array)  
- [x] Stack (using Linked List)  
- [x] Queue using Array  
- [x] Queue using Linked List  
- [x] Doubly Linked List  
- [x] Circular Linked List

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

Each `.java` file:
- Has a standalone `main()` method for testing.
- Includes inline comments for clarity.
- Is written for educational readability, not just performance.

Future folders (trees, heaps, graphs, tries, etc.) will follow the same structure for consistency across the project.
