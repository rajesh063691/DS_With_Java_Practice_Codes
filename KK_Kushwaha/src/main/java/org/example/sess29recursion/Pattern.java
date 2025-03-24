package org.example.sess29recursion;

public class Pattern {
    public static void main(String[] args) {
        // triangle(4, 0);
        triangle(4, 0);
    }


    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.printf("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }


    static void triangle1(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.printf("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }
}
