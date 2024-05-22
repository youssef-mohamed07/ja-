public class Queue {
    // Define the size of the queue
    int SIZE = 5;
    // Declare the array to store queue elements
    int items[] = new int[SIZE];
    // Declare variables to track the front and rear of the queue
    int front, rear;

    // Constructor to initialize the queue
    Queue() {
        front = -1; // Initialize front to -1 indicating the queue is empty
        rear = -1; // Initialize rear to -1 indicating the queue is empty
    }

    // Method to check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true; // Return true if the queue is full
        }
        return false; // Return false if the queue is not full
    }

    // Method to check if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true; // Return true if the queue is empty
        else
            return false; // Return false if the queue is not empty
    }

    // Method to add an element to the queue
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full"); // Print message if the queue is full
        } else {
            if (front == -1)
                front = 0; // If the queue is initially empty, set front to 0
            rear++; // Increment rear to insert the new element
            items[rear] = element; // Add the new element to the queue
            System.out.println("Inserted " + element); // Print the inserted element
        }
    }

    // Method to remove an element from the queue
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty"); // Print message if the queue is empty
            return (-1); // Return -1 to indicate the queue is empty
        } else {
            element = items[front]; // Get the front element of the queue
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* If the queue has only one element, reset the queue after removing it. */ else {
                front++; // Increment front to remove the element
            }
            System.out.println("Deleted -> " + element); // Print the removed element
            return (element); // Return the removed element
        }
    }

    // Method to display the elements of the queue
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue"); // Print message if the queue is empty
        } else {
            System.out.println("\nFront index-> " + front); // Print the front index
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) // Iterate through the queue elements
                System.out.print(items[i] + "  "); // Print each element

            System.out.println("\nRear index-> " + rear); // Print the rear index
        }
    }
}
