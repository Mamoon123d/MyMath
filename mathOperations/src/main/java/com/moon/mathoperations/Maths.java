package com.moon.mathoperations;
/*these are maths operations*/
public class Maths {

    public static int Plus(int no_1,int no_2){
        return no_1+no_2;
    }
    public static int Minus(int no_1,int no_2){
        return no_1-no_2;
    }
    public static int Multiply(int no_1,int no_2){
        return no_1*no_2;
    }
    public static int Division(int no_1,int no_2){
        if (no_2==0)
            throw new IllegalArgumentException("Division by Zero..error");
        else return no_1/no_2;
    }



}
