import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {

    int data;
    Node left;
    Node right;

    static Scanner sc = new Scanner(System.in);

    public Node(int d) {
        this.data = d;
        left = null;
        right = null;
    }

    public static Node constructTree() {
        int d;
        System.out.print("Enter the data: ");
        d = sc.nextInt();
        System.out.println();

        if (d == -1) {
            return null;
        }

        Node root = new Node(d);
        System.out.println("Enter the value on left of " + d + ": ");
        root.left = constructTree();

        System.out.println("Enter the value on right of " + d + ": ");
        root.right = constructTree();
        return root;
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr == null) {
                if (q.isEmpty()) {
                    return;
                }
                System.out.println();
                q.offer(null);
                continue;
            }
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    public static int maximum(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(Math.max(maximum(root.left), maximum(root.right)), root.data);
    }

    public static void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}

public class binaryTreeImplementation {
    public static void main(String[] args) {
        Node root = Node.constructTree();
        Node.preOrder(root);
        System.out.println();
        System.out.println(Node.height(root));
        System.out.println(Node.maximum(root));
        System.out.println("LevelOrderTraversal: ");
        Node.levelOrderTraversal(root);
        System.out.println();
    }
}
