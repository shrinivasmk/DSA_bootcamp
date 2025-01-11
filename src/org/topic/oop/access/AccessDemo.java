package org.topic.oop.access;

public class AccessDemo {
    private int num;
    int[] arr;
    protected String name;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public AccessDemo(int num, String name) {
        this.name = name;
        this.num = num;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    protected void display(){
        System.out.println("display");
    }
}
