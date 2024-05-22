class Main {


    // Main method to test the stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of capacity 5

        stack.push(1); // Push 1 into the stack
        stack.push(2); // Push 2 into the stack
        stack.push(3); // Push 3 into the stack
        stack.push(4); // Push 4 into the stack
        stack.push(5); // Push 5 into the stack
        stack.pop(); // Pop the top element from the stack
        stack.size(); // Get the current size of the stack
        stack.printStack(); // Print all elements in the stack

        stack.pop(); // Pop the top element from the stack
        System.out.println("\nAfter popping out");
        Queue q = new Queue(); // Create a new queue

        q.enQueue(1); // Enqueue 1 to the queue
        q.enQueue(2); // Enqueue 2 to the queue
        q.enQueue(3); // Enqueue 3 to the queue
        q.enQueue(4); // Enqueue 4 to the queue
        q.enQueue(5); // Enqueue 5 to the queue

        q.display(); // Display the elements of the queue

        q.deQueue(); // Dequeue an element from the queue
        q.display(); // Display the elements of the queue after dequeuing
       LinkedList llist = new LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("Linked list: ");
        llist.printList();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(3);
        llist.printList();

        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

        llist.sortLinkedList(llist.head);
        System.out.println("\nSorted List: ");
        llist.printList();


    }
}
