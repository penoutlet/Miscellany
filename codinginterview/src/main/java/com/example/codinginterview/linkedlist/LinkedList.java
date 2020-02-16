package com.example.codinginterview.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n = new Node(2);
        Node n2 = new Node(3);
        n.next = n2;
        head.next = n;

        Node node1 = new Node(1);
        Node head2 = new Node(1);
        Node node2= new Node(1);
        Node node3 = new Node(10);
        Node node4 = new Node(10);
        Node node5 = new Node(11);
        Node node6 = new Node(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        head2.next = node1;
//        h2.next = n; // n is the overlapping node.
//        n.next = n3; // tails will be the same.
        System.out.println("List prior to change: " + head2);
        System.out.println("Is h2 palindrome? " + isPalindrome(head2));
//        System.out.println("Head1: " + head);
//        System.out.println("Is head1 palindrome? " + isPalindrome(head));
//        System.out.println(overLappingNoCycle(head, h2));

        System.out.println(removeDupes(head2));


    }

    static Node overLappingNoCycle(Node l0, Node l1){

        int len0 = length(l0);
        int len1 = length(l1);
        if(len0 > len1){
            int diff = len0 - len1;
            l0 = advanceByK(l0,diff);
        }
        else {
            l1 = advanceByK(l1, len1-len0);
        }

       while(l0 != null && l1 != null && l0 != l1){
           l0 = l0.next;
           l1 = l1.next;
       }

        return l0;
    }

    static Node advanceByK(Node l, int k){

        while(k--!=0){
            l = l.next;
        }
        return l;
    }
    static int length(Node l){
        int len = 0;
        while(l!=null){
            len++;
            l = l.next;
        }
        return len;
    }
    // O (1) but only works when deleteMe is not the last node.
    public static void deleteNode(Node deleteMe){
        deleteMe.data = deleteMe.next.data;
        deleteMe.next = deleteMe.next.next;
    }
    // O(n)
    static Node deleteNode(Node head, Node deleteMe){
        if(head == deleteMe){
            head = head.next;
            return head;
        }
        Node current = head.next;
        while(current!=null){
            if (current.next==deleteMe){
                current.next = current.next.next;
                return head;
            }
        }
        return null;

    }
    static Node reverseList(Node head1){
        Node pointer = head1;
        Node h0 = null;
        Node hN = head1;

        while(pointer != null){
            pointer = pointer.next;
            hN.next = h0;
            h0 = hN;
            hN = pointer;
        }

        return h0;
    }

     public  Node mergeSortedLists(Node h1, Node h2) { return null;}

     // O(n) because we're iterating in worst case over all elements
    // O(n) space at worst because creating a new hashset, which could contain every n value.
     static boolean isPalindrome(Node head){
        if(head==null) return false;
        Node current = head;
         Set<Integer> seen = new HashSet<>();
         while (current != null) {
             if (seen.contains(current.data)){
                 seen.remove(current.data);
             } else {
                 seen.add(current.data);
             }
             current = current.next;
         }

         return seen.size() > 1 ? false : true;
     }

     // this works as long as the head is not a duplicate.
     static Node removeDupes(Node head){
         if(head==null) return null;
         Node current = head;
         Node previous = new Node(1);
         // need to have reference to the node before the one to delete.
         // need reference to one after the node to delete.

         Set<Integer> seen = new HashSet<>();
         seen.add(head.data);
         while (current != null) {
//             System.out.println("Current: " + current);
             System.out.println("Seen: " + seen);
             if (seen.contains(current.data)){
                 System.out.println("Contains: " + current.data);
//                 if(previous.next.data == current.next.data){
//                     previous.next = current.next.next;
//                 }
                 previous.next = current.next;
             } else {
                 System.out.println("Not contains; " + current.data);
                 seen.add(current.data);
             }

             previous = current;
             current = current.next;

         }
         return head;
     }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data + " " + this.next;
    }
}
