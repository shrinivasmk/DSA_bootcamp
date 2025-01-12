package org.topic.lnkedList;


public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.val+"-> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.display();
    }
}
