package org.topic.oop.interfaces;

public class MainInterface {
    public static void main(String[] args) {
        NiceCar niceCar = new NiceCar();
        niceCar.start();
        //niceCar.upgradeEngine();
        niceCar.start();

        NiceCar niceCar1 = new NiceCar(new ElectricEngine());
        niceCar1.start();

        niceCar.startMusic();
    }
}
