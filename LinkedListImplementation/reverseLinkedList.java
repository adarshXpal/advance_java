class Node {
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);
        Node nexthead = head.next;
        nexthead.next = head;
        head.next = null;
        return newHead;
    }

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public static Node firstNodeDetectCycle(Node head) {
        Node start = head;
        Node meet = detectCycle(head);

        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
}

public class reverseLinkedList {
    public static void main(String[] args) {

    }
}
