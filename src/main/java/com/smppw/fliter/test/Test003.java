package com.smppw.fliter.test;

import java.util.function.IntPredicate;

public class Test003 {
    public static void printNum(IntPredicate predicate) {
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i
                :
                arr
        ) {
            if(predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printNum((x)->{return x>5;});
    }
}
