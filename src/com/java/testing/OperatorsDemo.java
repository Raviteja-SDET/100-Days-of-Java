package com.java.testing;

public class OperatorsDemo {
    public static void main(String[] args) {

        //Arithmetic operators + - * / %

        int a = 20;
        int b = 10;

        System.out.println("sum of a and b is:"+(a+b));
        System.out.println("diff of a and b is:"+(a-b));
        System.out.println("mul of a and b is:"+(a*b));
        System.out.println("div of a and b is:"+(a/b));
        System.out.println("modulo of a and b is:"+(a%b));

        //Relational/Comparison operator > >= < <= == !=
        //always returns a boolean value

       // b = 20;

        System.out.println(a>b);//true
        System.out.println(a<b);//false
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a==b);

        //Logical operators && || !
        //returns boolean value - true / false
        //works between 2 boolean values

        boolean x = true;
        boolean y = false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); //false
        System.out.println(!y); //true

        boolean b1 = 10>20;
        System.out.println(b1);

        boolean b2 = 20>10;
        System.out.println(b2);

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true

        System.out.println((10<20) && (20>10)); //true && true
        System.out.println((10<20) || (20>10)); //true || true
        System.out.println(!(10<20)); //false



















    }
}
