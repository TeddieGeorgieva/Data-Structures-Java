package com.company;

public class LinkedList {

    class Node {
        int data;
        Node next;
        Node(int _data, Node _next) {
            data = _data;
            next =_next;
        }
        Node(int _data) {
            data = data;
            next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }
    public void Push(int num){
        if(head == null){
            head = new Node(num);
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(num);
        }
    }
    public void Print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
