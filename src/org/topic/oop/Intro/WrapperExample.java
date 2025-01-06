package org.topic.oop.Intro;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        Integer a = 10;
        Integer b = 20;
// In java and primitive there will be no pass by reference it will pass by value
        swap(a,b);

        System.out.println(a+" "+b);


        final int val;

        //val = 22;


        A obj = new A("Hardik");
       // System.out.println(obj);

        for (int i = 0;i<100000000;i++){
            obj =  new A("random Name");
        }

    }

    static void swap(int a, int b){
        int temp = b;
        a = b;
        b = temp;
    }




}

class A{
    String name;
     A(String name){
         this.name = name;
     }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed the object");
    }
}
