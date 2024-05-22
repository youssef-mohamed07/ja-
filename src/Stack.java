public class Stack {
    // Declare the array to store stack elements
    private int arr[];
    // Declare the top variable to track the top of the stack
    private int top;
    // Declare the capacity of the stack
    private int capacity;

    // Constructor to initialize the stack with a given size
    Stack(int size) {
        arr = new int[size]; // Create an array of the given size
        capacity = size; // Set the stack capacity
        top = -1; // Initialize the top of the stack to -1 (indicating the stack is empty)
    }

    // Method to add elements to the stack
    public void push(int x) {
        // Check if the stack is full
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1); // Terminate the program if the stack is full
        }

        System.out.println("Inserting " + x);
        arr[++top] = x; // Increment the top and insert the element
    }

    // Method to remove elements from the stack
    public int pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1); // Terminate the program if the stack is empty
        }
        return arr[top--]; // Return the top element and decrement the top
    }

    // Method to return the size of the stack
    public int size() {
        return top + 1; // Return the number of elements in the stack
    }

    // Method to check if the stack is empty
    public Boolean isEmpty() {
        return top == -1; // Return true if the stack is empty
    }

    // Method to check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1; // Return true if the stack is full
    }

    // Method to print all elements in the stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]); // Print each element in the stack
        }
    }
}
