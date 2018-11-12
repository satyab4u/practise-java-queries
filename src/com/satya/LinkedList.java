package com.satya;


/**
 * Created by Satya on 10/24/18.
 */
public class LinkedList {

    private static class Node{
        int data;
        Node next;
        private Node(int data){
            this.data=data;
        }
    }

    private Node head;

    public void append(int data){
        if(head == null)
        {
            head=new Node(data);
            return;
        }
        Node current=head;
        while(current.next != null){
            current=current.next;

        }
        current.next=new Node(data);
    }

    public void printAll(){
        Node current=head;
        while(current != null){
            System.out.println("Values::"+current.data);
            current=current.next;
        }
    }

    public int deleteNode(int data){
        if(head.data == data)
            head=head.next;
        Node current=head;
        int value=0;
        while(current.next.data==data){
            value=current.next.data;
            current.next=current.next.next;
        }
       return value;
    }





    public static void main(String args[]){

        LinkedList list=new LinkedList();
        list.append(1);
        list.append(3);
        list.append(5);
        list.printAll();
        list.deleteNode(3);
        list.printAll();




    }




}
