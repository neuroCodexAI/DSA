package LinkedList;

public class Reverse_linkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node last;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = last = newNode;
            return;
        }
        last.next = newNode;
        last = newNode;
    }

    public void print() {
        Node move = head;
        while (move != null) {
            System.out.print(move.data + " ");
            move = move.next;
        }
    }

    public void reverse_list() {
        Node prev = null;
        Node curr = last = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        Reverse_linkedList ll = new Reverse_linkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println();
        ll.reverse_list();
        ll.print();
    }
}
