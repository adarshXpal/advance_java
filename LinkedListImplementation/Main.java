class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node it = head;
            while (it.next != null) {
                it = it.next;
            }
            it.next = newNode;
        }
    }

    public void insertAtPosition(int d, int p) {
        Node newNode = new Node(d);
        Node first = head;
        Node second = null;

        if (p == 1) {
            head = newNode;
            return;
        }

        while (p > 1) {
            if (first.next == null) {
                System.out.println("Position is out of bonds");
                return;
            }
            second = first;
            first = first.next;
            p--;
        }
        second.next = newNode;
        newNode.next = first;
    }

    public void printList() {
        Node it = head;
        while (it != null) {
            System.out.print(it.data + " ");
            it = it.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(12);
        ls.insert(43);
        ls.insert(76);
        ls.insert(1);
        ls.insertAtPosition(98, 9);
        ls.printList();
        System.out.println();
    }
}
