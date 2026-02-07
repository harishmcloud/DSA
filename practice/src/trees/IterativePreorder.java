package trees;

import java.util.*;

public class IterativePreorder {

    private static void preOrder(Node root) {
        Stack<Node> st = new Stack<>();
        
        if(root == null) return;
        st.push(root);
        while(!st.isEmpty()) {
            Node node = st.pop();
            System.out.print(node.data + " ");
            if(node.right != null) {
                st.push(node.right);
            }
            if(node.left != null) {
                st.push(node.left);
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        System.out.print("Iterative pre-order: ");
        preOrder(root);
    }
}
