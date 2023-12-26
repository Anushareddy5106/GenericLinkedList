public class LinkedList {
    Node head;

    // Adding the element
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insertion
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete from front
    public void pop() {
        if (head == null) {
            System.out.println("The linked list is empty. Cannot pop.");
            return;
        }

        head = head.next;
    }

    // Deletion from last
    public void popLast() {
        if (head == null) {
            System.out.println("The linked list is empty. Cannot pop.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
    }

    // Searching
    public Node search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Deleting the node with specific key
    public void delete(int key) {
        Node current = head;
        Node prev = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found in the linked list.");
            return;
        }

        prev.next = current.next;
    }

    // Display
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
