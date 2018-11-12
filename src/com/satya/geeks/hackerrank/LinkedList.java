package com.satya.geeks.hackerrank;

/**
 * Created by Satya on 11/11/18.
 */
public class LinkedList {

    private Node head;

    private class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data= data;
        }
    }

    public void printList() {
        Node current= head;
        while(current != null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public void push(int data) {
        Node new_Node=new Node(data);
        new_Node.next=head;
        head=new_Node;
    }

    public void insertAfter(Node prev_Node,int data) {
        if(prev_Node == null) {
            System.out.println("The previous node cannot be null");
            return;
        }
        Node new_Node=new Node(data);
        new_Node.next=prev_Node.next;
        prev_Node.next=new_Node;
    }

    public void append(int data) {
        Node new_Node=new Node(data);

        if(head == null) {
            head= new_Node;
            return;
        }
        Node current= head;
        while(current.next != null) {
            current=current.next;
        }
        current.next=new_Node;
        return;
    }

    public void deleteNode(int data) {
        Node current=head;

        if(current.data == data) {
            head=current.next;
            return;
        }

        while(current != null && current.next != null) {
            if(current.next.data == data) {
                current.next=current.next.next;
            }
            else {
                current = current.next;
            }
        }

    }

    public static void main(String args[]) {
        LinkedList list=new LinkedList();
        list.push(7);
        list.append(6);
        list.insertAfter(list.head.next,10);
        list.printList();
        list.deleteNode(10);
        list.printList();
    }


}
