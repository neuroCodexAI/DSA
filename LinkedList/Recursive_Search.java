package LinkedList;

public class Recursive_Search {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add node in last node
    public static void addNodeTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    // display node
    public static void display_node() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    // Recursive search helper function
    private static int recSearch_helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recSearch_helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;

    }

    // Recursive Search function
    public static int recSearch(int key) {
        return recSearch_helper(head, key) + 1;
    }

    public static void main(String[] args) {
        addNodeTail(1);
        addNodeTail(2);
        addNodeTail(3);
        addNodeTail(4);
        addNodeTail(5);

        System.out.println(recSearch(3));
    }
}