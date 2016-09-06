/*
    Jeremy Wolfe
    September 6, 2016

    Lab 3 Program 2
    This program creates two string arrays and compares the filename
    extension to a list of program extensions to decide if the
    filename is a valid program file.
 */

package com.wolfe;

import java.util.Scanner;

public class Main {

    //Create two scanners, one for Strings, and one for numbers - int and float values.

    //Use this scanner to read text data that will be stored in String variables
    static Scanner stringScanner = new Scanner(System.in);
    //Use this scanner to read in numerical data that will be stored in int or double variables
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Write your code between here...

        String[] fileNames = { "random.py", "assignment.doc", "report.pdf",
                "math.c", "airfares.xls", "main.java", "computing.jave"};

        String[] extensions = { ".java", ".c", ".py"};



        // ... and here.

        // Close scanners. Good practice to clean up resources you use.
        // Don't try to use scanners after this point. All code that uses scanners goes above here.
        stringScanner.close();
        numberScanner.close();
    }
}
