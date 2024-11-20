package LinkedList;

public class CheckPalindrome_linkedList {
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

    // Find middle node
    // Slow fast technique
    public Node findMidd(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Check palindrome
    public boolean checkPalindrome() {
        Node middNode = findMidd(head);
        if (head == null || head.next == null) {
            return true;
        }

        // reverse list 2nd half list
        Node prev = null;
        Node curr = middNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        CheckPalindrome_linkedList ll = new CheckPalindrome_linkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.checkPalindrome());
    }
}
