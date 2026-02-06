package trees;

import java.util.*;

public class BFS {
    // level order traversal (level by level traversal of a binary tree)

    private static ArrayList<ArrayList<Integer>> bfs(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();

        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int currSize = q.size();
            while(currSize-- > 0) {
                Node node = q.poll();
                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
                list.add(node.data);
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> ans = bfs(root);
        System.out.println("BFS: " + ans);
    }
}
