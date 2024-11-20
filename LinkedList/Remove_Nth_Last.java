package LinkedList;

// Find & Remove Nth node from end... 
//1->2->3->4->5->null
// n= 2;
//1->2->3->5->null

public class Remove_Nth_Last {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node last;

    // add node in last node
    public void addLast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = last = temp;
            return;
        }
        last.next = temp;
        last = temp;
    }

    // display node
    public void display_node() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Remove Nth node from end
    public void removeNth_last(int n) {
        Node move = head;
        int size = 0;
        // Size count
        while (move != null) {
            move = move.next;
            size++;
        }

        // remove First
        if (n == size) {
            head.next = head;
            return;
        }
        // nth remove
        int itoNth = size - n;
        int i = 1;
        Node prev = head;
        while (i < itoNth) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }

    public static void main(String[] args) {
        Remove_Nth_Last ll = new Remove_Nth_Last();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.display_node();
        ll.removeNth_last(3);
        ll.display_node();
    }

}
