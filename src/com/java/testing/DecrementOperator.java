package com.java.testing;

public class DecrementOperator {
    public static void main(String[] args) {
        /*
        int a = 100;
        a =  a - 1 ;
        System.out.println(a);
         */

       /* int a = 100;
        int res = a--;
        System.out.println(res); // 100

        */

        // pre-decrement operator
        int a = 100;
        int res = --a;
        System.out.println(res);
        int res1 = --res;
        System.out.println(res1);



    }
}
