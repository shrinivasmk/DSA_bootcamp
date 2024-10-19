package org.examples.loop;

public class CountingOccurance {

    public static int count(int num, int number){
        int count = 0;
        int rem = 0;
        while (number > 0){
            rem = number % 10;
            number = number/10;
            if (rem == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(6,266667));
    }
}
