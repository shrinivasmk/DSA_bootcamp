package org.topic.oop.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    double weight;

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
       // super.weight = weight;
        this.cost = cost;
    }

    void printStatement(){
        System.out.println("1st statement");
    }

//    String printStatement(String string){
//        System.out.println("1st statement");
//    }
}
