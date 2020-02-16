package com.example.codinginterview.graphsandtrees;

import java.util.ArrayList;
import java.util.List;

public class BST {

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        TreeNode t1 = new TreeNode(20);
        TreeNode t2 = new TreeNode(-1);

        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(t1);
        treeNodes.add(t2);

        for(TreeNode n : treeNodes){
            t.insert(n);
        }

        System.out.println(t);

    }
}
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
    }
    void insert(TreeNode newNode){

        if( this.data < newNode.data ){
            if(this.right!=null){
                this.right.insert(newNode);
            } else {
                this.right = newNode;
            }
        }
        else if (this.data > newNode.data){
            if (this.left!=null){
                this.left.insert(newNode);
            } else {
                this.left = newNode;
            }
        }

    }

    @Override
    public String toString() {
        return this.data + " left " + this.left + " right " + this.right;
    }
}