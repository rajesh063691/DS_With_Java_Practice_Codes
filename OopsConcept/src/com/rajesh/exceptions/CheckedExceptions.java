package com.rajesh.exceptions;


import java.io.*;

// Main class
class CheckedExceptions {

    // Main driver method
    public static void main(String[] args)
            throws IOException {

        // Creating a file and reading from local repository
        FileReader file = new FileReader("/Users/rajesh/Java_DS_Tutorial/OopsConcept/src/com/rajesh/exceptions/a.txt");

        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fileInput.close();
    }
}
