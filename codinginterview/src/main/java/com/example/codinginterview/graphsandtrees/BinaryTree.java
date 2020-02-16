package com.example.codinginterview.graphsandtrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(2);
        Node left = new Node(3);
        Node right = new Node(4);
        Node lL = new Node(10);
        Node lR = new Node(12);
        Node rL = new Node(20);
        Node rR = new Node(100);
        left.left = lL;
        left.right = lR;
        right.left = rL;
        right.right = rR;

        root.left = left;
        root.right = right;

        System.out.println(levelOrderTraversal(root));
    }

    public static List<List<Node>> levelOrderTraversal(Node root){
        List<List<Node>> bigList = new ArrayList<>();
        List<Node> smallList = new ArrayList<>();
        smallList.add(root);
        bigList.add(smallList);

        List<Node> previousList = bigList.get(bigList.size()-1);
        while(!previousList.isEmpty()){
                    smallList = new ArrayList<>();

            for (Node n: previousList) {
//                System.out.println(n);
            if(n.left!=null){
                smallList.add(n.left);
            }
            if (n.right != null) {
                smallList.add(n.right);
            }
            }
//            if(smallList==null){
//                break;
//            }
            bigList.add(smallList);
            previousList = bigList.get(bigList.size()-1);
//            System.out.println(previousList);
        }

        bigList.remove(previousList);
        return bigList;
    }


}
class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node " + this.data + " ";
    }
}