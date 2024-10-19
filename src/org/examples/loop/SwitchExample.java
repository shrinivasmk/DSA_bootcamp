package org.examples.loop;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("invalid input");
        }

         */

        String fruit = sc.next();

        switch (fruit) {
            case "Apple" -> System.out.println("Apple");
            case "orange" -> System.out.println("orange");
            case "graphes" -> System.out.println("graphes");
            default -> System.out.println("invalid");
        }

    }
}
