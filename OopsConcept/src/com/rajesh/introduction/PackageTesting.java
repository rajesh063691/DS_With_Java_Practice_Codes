package com.rajesh.introduction;


// Java Program to Implement
// MultiLevel Inheritance

// Interface 1
interface InterfaceA {
    public default void methodA(){
        System.out.println("Hello from A");
    }
}

// Interface 2
interface InterfaceB {
   // void methodA();
   public default void methodA(){
       System.out.println("Hello from B");
   }
}

// Class
class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void methodA() {
        InterfaceB.super.methodA();
    }

}

public class PackageTesting{
    public static void main(String []args){
        // Inheriting Properties from InterfaceA
        InterfaceA x=new MyClass();
        x.methodA();
        // Inheriting Properties from InterfaceB
        InterfaceB y=new MyClass();


        y.methodA();
    }
}

