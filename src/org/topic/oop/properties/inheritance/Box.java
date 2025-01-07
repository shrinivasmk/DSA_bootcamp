package org.topic.oop.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box other) {
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }

}
