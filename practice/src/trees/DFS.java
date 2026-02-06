package trees;

public class DFS {
    /* DFS
    * 1. pre-order traversal (root -> left -> right)
    * 2. in-order traversal (left -> root -> right)
    * 3. post-order traveral (left -> right -> root)
    */

    private static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Inorder: ");
        inOrder(root);
        System.out.println();
    }
}
