package com.java.testing;

public class LogicalOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println((x==y)&&(x<=y));  //false&&true
        System.out.println((x==y)||(x<=y));  //false||true
        System.out.println((x<y)&&(x<=y));  //true&&true
        System.out.println((x>y)&&(x>=y));  //false && false
        System.out.println((x>y)&&(x<y));  //false && true
        System.out.println((x>y)||(x<y));  //false || true

    }
}
