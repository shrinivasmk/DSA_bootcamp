package org.topic.stacks_queues;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int size = 0;
    int front = 0;
    int end = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("stack is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return data[front];
    }



    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int i = front;

        do{
            System.out.print(data[i]+" <- ");
            i++;
            i = i % data.length;
        } while( i != end);
        System.out.println("END");
    }
}
