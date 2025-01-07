package org.topic.oop.staticExample;

public class Main {
    public static void main(String[] args) {
        Human person1 = new Human(22,"virat", false);
        Human person2 = new Human(34, "Rohit", true);

        System.out.println(person1.name);
        System.out.println(person2.name);

        System.out.println(Human.population);
        Main main1 = new Main();
        main1.fun();

        greeting();
    }

    void fun(){
        System.out.println(" fun method printed");
        greeting();
    }

    void fun2(){
        System.out.println(" fun2 method printed");
       // greeting();
    }



    static void greeting(){
        Main main1 = new Main();
        main1.fun2();
        System.out.println("Greeting method is printed");
    }
}
