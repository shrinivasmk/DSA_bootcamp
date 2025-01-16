package org.topic.stacks_queues.Questions;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while (!isEmpty()){
            second.push(first.pop());
        }

        int popped = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return popped;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek(){
        while (!isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

    public void display(){
        if(!isEmpty()){
            for(int i = 0 ; i<first.size(); i++){
                System.out.print(first.get(i) +  "<- ");
            }
            System.out.println("END");
        }
    }

    public static void main(String[] args) {
        QueueUsingStack list = new QueueUsingStack();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.display();
        list.remove();
        list.display();
        System.out.println(list.peek());


    }

}
