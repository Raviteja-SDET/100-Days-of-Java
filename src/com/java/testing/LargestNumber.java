package com.java.testing;
/*
a>b and a>c -- a is largest
b>a and b>c -- b is largest
c>a and c>b -- c is largest
 */
public class LargestNumber {
    public static void main(String[] args) {

        //Largest of 3 numbers
        int a = 60;
        int b = 50;
        int c = 30;

        if(a>b && a>c)
        {
            System.out.println("a is largest number");
        }
        else if (b>a && b>c )
        {
            System.out.println("b is largest number");
        }
        else
        {
            System.out.println("c is largest number");
        }


    }
}
