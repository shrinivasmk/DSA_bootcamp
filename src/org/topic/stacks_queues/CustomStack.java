package org.topic.stacks_queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public  CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();
        stack.push(3);
        stack.push(9);
        stack.push(2);
        stack.push(6);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());



    }
}
