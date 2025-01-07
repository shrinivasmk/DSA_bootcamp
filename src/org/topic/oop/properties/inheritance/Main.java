package org.topic.oop.properties.inheritance;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box();
        System.out.println(box1.w);

        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.w);

        //BoxWeight box3 = new Box();

        Box box3 = new BoxWeight(3,4,7,10);
        System.out.println(box3.w);

        Box box4 = new BoxWeight(box2);
        System.out.println(box4.h);

        BoxPrice boxPrice = new BoxPrice(1,2,3,4,5);
        System.out.println(boxPrice.weight);

    }
}
