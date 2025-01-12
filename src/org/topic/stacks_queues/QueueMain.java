package org.topic.stacks_queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {

        /*
        //Custom Queue

        CustomQueue queue = new CustomQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();
        queue.remove();
        queue.display();


         */



//        // Cyclic Queue
//
//        CircularQueue queue = new CircularQueue();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(7);
//        queue.insert(8);
//        queue.insert(9);
//        queue.insert(10);
//        queue.insert(11);
//        queue.insert(12);
//
//        queue.display();
//        System.out.println(queue.remove());
//        System.out.println(queue.front());
//        queue.display();





        DynamicQueue queue = new DynamicQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);

        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.front());
        queue.display();


    }
}
