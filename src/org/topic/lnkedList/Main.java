package org.topic.lnkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(23);
        list.insertFirst(33);
        list.insertFirst(35);
        list.insertLast(55);
        //list.display();
        list.insertRec(40,2);
        list.display();

//        DLL list = new DLL();
//        list.insertFirst(33);
//        list.insertFirst(23);
//        list.insertFirst(44);
//        list.insertLast(39);
//        list.display();
//        list.insert(39, 88);
//        list.display();
        //list.displayReverse();
    }
}
