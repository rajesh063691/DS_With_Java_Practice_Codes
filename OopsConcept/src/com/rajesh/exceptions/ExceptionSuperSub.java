package com.rajesh.exceptions;


// Java Program to Illustrate Exception Handling
// with Method Overriding
// Where SuperClass does not declare any exception and
// subclass declare checked exception

// Importing required classes

import java.io.*;

class ExceptionSuperSub {

    // SuperClass doesn't declare any exception
    void method() throws Exception {
        System.out.println("SuperClass");
    }
}

// SuperClass inherited by the SubClass
class SubClass extends ExceptionSuperSub {

    // method() declaring Checked Exception IOException
    void method() throws IOException {

        // IOException is of type Checked Exception
        // so the compiler will give Error

        System.out.println("SubClass");
    }

    // Driver code
    public static void main(String args[]) throws Exception {
        ExceptionSuperSub s = new SubClass();
        s.method();
    }
}
