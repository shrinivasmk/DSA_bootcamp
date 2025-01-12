package org.topic.stacks_queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull(){
        //return this.data.length == DEFAULT_SIZE;
        return end == DEFAULT_SIZE;
    }

    public boolean insert(int item) {
        if(isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw  new Exception("Queue is empty");
        }
        int remove = data[0];
        for (int i=1;i< end;i++){
            data[i] = data[i+1];
        }
        end--;
        return remove;
    }

    public void display(){
        if(!isEmpty()){
            for(int i=0; i<end;i++){
                System.out.print(data[i]+" <- ");
            }
        }
        System.out.println("END");
    }

}
