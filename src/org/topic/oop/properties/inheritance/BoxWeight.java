package org.topic.oop.properties.inheritance;

public class BoxWeight extends Box {
    double weight;


    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double weight) {
        this.weight = weight;
    }

    BoxWeight(double side, Double weight) {
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = -1;
    }

    BoxWeight(BoxWeight old) {
        super(old);
        this.weight = old.weight;
    }
}
