package com.rajesh.staticExample;

// initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;


    // static block executes only once when the first object is created i.e for the first time class gets loaded
    static {
        System.out.println(" I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.a + "::" + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + "::" + StaticBlock.b);
        StaticBlock sb1 = new StaticBlock();
        System.out.println(StaticBlock.a + "::" + StaticBlock.b);

    }
}
