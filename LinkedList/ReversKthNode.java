package LinkedList;

public class ReversKthNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node reverseList(Node head) {
        Node move = null;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            move = curr.next;
            curr.next = prev;
            prev = curr;
            curr = move;
        }

        return prev;
    }

    private static Node getKthNode(Node head, int k) {
        Node move = head;
        int count = 1;
        while (move != null && count < k) {
            move = move.next;
            count++;
        }
        return move;
    }

    public static Node reverseKthNode(Node head, int k) {

        if (head == null || k <= 1) {
            return head;
        }

        Node temp = head;
        Node prevNode = null;
        while (temp != null) {

            Node kthNode = getKthNode(temp, k);
            if (kthNode == null) {
                break;
            }

            Node newSegment = kthNode.next;
            kthNode.next = null;

            Node newHead = reverseList(temp);

            if (prevNode == null) {
                head = newHead;
            } else {
                prevNode.next = newHead;
            }

            temp.next = newSegment;
            prevNode = temp;
            temp = newSegment;
        }

        return head;
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
        Node newHead = reverseKthNode(head, 2);

        printList(newHead);

    }
}
