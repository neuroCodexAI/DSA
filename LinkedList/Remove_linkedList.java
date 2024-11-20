package LinkedList;

public class Remove_linkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node last;
    public static int size;

    public void addNode(int data) {
        if (head == null) {
            head = last = new Node(data);
            size++;
            return;
        }
        last.next = new Node(data);
        size++;
        last = last.next;

    }

    public void print(Node head) {
        Node move = head;
        if (size == 0) {
            System.out.println("No list exist");
            return;
        }
        while (move.next != null) {
            System.out.print(move.data + ", ");
            move = move.next;
        }
        System.out.println(move.data + "--> null");
    }

    // Remove node from first node
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = last = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove node from last node
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = last = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.data; // last node of data
        prev.next = null;
        last = prev;
        size--;
        return val;

    }

    public static void main(String[] args) {
        Remove_linkedList reLL = new Remove_linkedList();
        reLL.addNode(1);
        reLL.addNode(2);
        reLL.addNode(3);
        reLL.addNode(4);

        reLL.print(head);
        reLL.removeFirst();

        reLL.print(head);
        reLL.removeFirst();

        reLL.print(head);
        reLL.removeLast();

        reLL.print(head);
        reLL.removeLast();

        reLL.print(head);
        reLL.removeLast();

        reLL.print(head);
    }

}
