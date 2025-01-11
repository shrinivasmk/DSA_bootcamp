package org.topic.lnkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        if (tail  ==null){
            tail = head;
        }
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if(head == null){
            //insertFirst(value);
            node.prev = null;
            head = node;
            return;
        }
         while(last.next!= null){
             last = last.next;
         }

         last.next = node;
         node.prev = last;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value ==  value){
                return node;
            }
            node = node.next;
        }
        return  null;
    }

    public void display(){
        Node temp = head;
        System.out.println();
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void displayReverse(){
        Node temp = tail;
        System.out.println();
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.print("END");
    }


    public void insert(int after, int value){
        Node pNode = find(after);

        if (pNode == null){
            System.out.println("node doesn't exist");
        }

        Node node = new Node(value);
        node.next = pNode.next;
        pNode.next = node;
        node.prev = pNode;
        if(node.next != null){
            node.next.prev = node;
        }
    }

//    public void insert(int after, int val) {
//        Node p = find(after);
//
//        if (p == null) {
//            System.out.println("does not exist");
//            return;
//        }
//
//        Node node = new Node(val);
//        node.next = p.next;
//        p.next = node;
//        node.prev = p;
//        if (node.next != null) {
//            node.next.prev = node;
//        }
//    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
