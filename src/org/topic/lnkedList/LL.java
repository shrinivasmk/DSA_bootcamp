package org.topic.lnkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size +=1;

    }

    public void display(){
        Node temp = head;
        System.out.println();
        while (temp != null && !hasCycle(head)){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.print("END");
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size +=1;
    }

    private class Node{
        private int value;
        private Node next;


        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val,index,head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1,node.next);
        return node;
    }



    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void duplicate(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size --;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    // merge two LL
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while (f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }



    //Linked List Cycle
    //https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }



    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp == slow);
                return length;
            }
        }
        return 0;
    }

    public void insertCyclic(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertCyclic(int val, int dot){
        Node point = find(dot);
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        tail.next = point;
        size++;
    }

    public Node find(int val){
        Node node = head;
        if(head != null){
            while (node.next != null){
                if(node.value == val){
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }




    public static void main(String[] args) {

      /*

        //merge  sort
        LL first  = new LL();
        LL second  = new LL();

        first.insertLast(1);
        first.insertLast(9);
        first.insertLast(7);
        first.insertLast(17);

        second.insertLast(1);
        second.insertLast(8);
        second.insertLast(23);

        LL ans = LL.merge(first, second);
        ans.display();

       */

        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        //System.out.println(list.find(3).value);
        list.insertCyclic(5,3);
        list.display();

    }
}
