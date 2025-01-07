package org.topic.oop.staticExample;


//class Test {
//    static String name;
//
//    Test(String name){
//        Test.name = name;
//    }
//
//}

public class InnerClass {
    static public class Test {
    //public class Test {
        String name;

        Test(String name) {
            this.name = name;
            //Test.name = name;
        }

    }

    public static void main(String[] args) {
        Test test1 = new Test("Virat");
        Test test2 = new Test("Rohit");

        System.out.println(test1.name);
        System.out.println(test2.name);
    }
}
