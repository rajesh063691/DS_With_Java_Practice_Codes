

// Java program to demonstrate
// working of interface.
import java.io.*;

// A simple interface
interface in1 {
    // public, static and final
    final int a = 10;
    static final int rateOfIntrest=6;

    // public and abstract
    void display();
}

// A class that implements the interface.
class InterfaceImp1 implements in1 {

    // Implementing the capabilities of
    // interface.
    public void display() { System.out.println("Geek"); }

    // Driver Code
    public static void main(String[] args)
    {
        InterfaceImp1 t = new InterfaceImp1();
        t.display();
        System.out.println(InterfaceImp1.a*InterfaceImp1.rateOfIntrest);
    }
}

