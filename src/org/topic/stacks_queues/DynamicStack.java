package org.topic.stacks_queues;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()){
            int[] tmp = new int[data.length * 2];
            for(int i = 0; i<data.length ; i++){
                tmp[i] = data[i];
            }
            data = tmp;
        }
        return super.push(item);
    }
}
