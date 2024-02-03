package com.rajesh;

public class Main {
    public static void main(String[] args) {

        Student rajesh = new Student();
        System.out.println(rajesh);
        System.out.println(rajesh.id);
        System.out.println(rajesh.name);
        System.out.println(rajesh.marks);

        Student puja = new Student(12, "Puja Kumari", 88.0f);
        System.out.println(puja.id);
        System.out.println(puja.name);
        System.out.println(puja.marks);
    }


}

class Student {
    int id;
    String name;
    float marks;


    Student() {
        id = 123;
        name = "Rajesh Kumar";
        marks = 90.0f;
    }

    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
