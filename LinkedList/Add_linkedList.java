package LinkedList;

public class Add_linkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // Add node at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add in the middle
    public void addMidd(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node move = head;

        int i = 0;
        // while (move != null) {
        // if (idx == i) {
        // newNode.next = move.next;
        // move.next = newNode;
        // }
        // i++;
        // move = move.next;
        // }/

        while (i < idx - 1) {
            i++;
            move = move.next;
        }

        newNode.next = move.next;
        move.next = newNode;
        return;

    }

    // Display node
    public void disp(Node head) {
        Node move = head;
        if (move == null) {
            System.out.println("No list exist");
            return;
        }
        while (move.next != null) {
            System.out.print(move.data + ", ");
            move = move.next;
        }
        System.out.println(move.data + "--> null");
    }

    public static void main(String[] args) {
        Add_linkedList ll = new Add_linkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(5);
        ll.addMidd(2, 9);

        ll.disp(head);
        System.out.println(size);
    }
}
