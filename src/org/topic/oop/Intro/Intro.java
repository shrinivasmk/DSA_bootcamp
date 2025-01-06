package org.topic.oop.Intro;

public class Intro {
    public static void main(String[] args) {

        //default constructor
        Student student1 = new Student();
       // student1.name = "Rohit";

//        student1.name = "Shrinivas";
//        student1.rno = 22;
//        student1.marks = 45.3f;

        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student student2 = new Student(23, "ram",44.78f);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        Student student3 = new Student();
        Student student4 =  student3;
        student3.name = "Rohit";

        System.out.println(student3.name);
        System.out.println(student4.name);


    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
//        this.name = "Shrinivas";
//        this.rno = 22;
//        this.marks = 45.3f;
        this (10,"virat",100.00f); // calling a constructor from another constructor using this keyword.
    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
