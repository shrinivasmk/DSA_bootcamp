package org.topic.oop.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();
    private Brakes brakes;

    public NiceCar(){
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    void startMusic(){
       // player = new CDPlayer();
        player.start();
    }

    void stopMusic(){
        player.stop();
    }

    public void start(){
        engine.start();
    }


    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

}
