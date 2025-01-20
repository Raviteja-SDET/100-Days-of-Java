package com.java.testing;

public class Swapping {
    public static void main(String[] args) {

        //swapping of two numbers
        /*
        int a = 10;
        int b = 20;
        int c;

        System.out.println("before swapping "+"a="+a+" "+"b="+b);
        //swapping logic
        c = a;
        a = b;
        b = c;

        System.out.println("after swapping "+"a="+a+" "+"b="+b);

         */

        //swapping 2 numbers without using third variable
        int a = 10;
        int b = 20;

        System.out.println("before swapping "+"a="+a+" "+"b="+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swapping "+"a="+a+" "+"b="+b);








    }
}
