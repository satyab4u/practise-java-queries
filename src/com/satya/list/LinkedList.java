package com.satya.list;

/**
 * Created by Satya on 10/31/18.
 */
public class LinkedList {
    private Node head;

    public static class Node {

        int data;

        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public void deleteKey(int key) {

        Node temp = head;

        while(temp.next != null) {

            if(temp.next.data == key) {
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }

    }

    public static void main(String args[]){
        LinkedList list=new LinkedList();
        list.head=new Node(7);
        Node second=new Node(2);
        Node third=new Node(5);

        Node temp= list.head;

        while (temp != null){
            temp.next=second;
            temp=temp.next;
        }

        list.printList();
    }
}

