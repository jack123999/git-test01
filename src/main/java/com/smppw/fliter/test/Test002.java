package com.smppw.fliter.test;

import java.util.function.IntBinaryOperator;

public class Test002 {
    public static void main(String[] args) {
        int result = cal((x,y)->{return x + y;});
        System.out.println(result);
    }
    public static int cal(IntBinaryOperator binaryOperator) {
        int a =     10;
        int b = 10;
        return binaryOperator.applyAsInt(a,b);

    }
}
