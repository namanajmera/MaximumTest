package com.findmaximum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximum<T extends Comparable<T>> {
    private T firstValue, secondValue, thirdValue;

    public FindMaximum(T firstValue, T secondValue, T thirdValue) {
        super();
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

//    I comment these all three method so that other test not use these code for testing

    /* public static Integer maximum(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static Float maximum(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static String maximum(String value1, String value2, String value3) {
        String max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        return max;
    } */

    //    Convert to Generic Method.
    public static <T extends Comparable<T>> T maximum(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        printMax(num1,num2,num3,max);
        return max;
    }

    private static <T extends Comparable<T>> void printMax(T num1, T num2, T num3, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n",num1,num2,num3,max);
    }

    //    Putting Multiple Inputs in Parameters using varargs
    @SafeVarargs
    public static <T extends Comparable<T>> T maximum(T... values) {
        List<T> tList = Arrays.asList(values);
        Collections.sort(tList);
        return tList.get(tList.size() - 1);
    }

    public T testMaximum() {
        return maximum(firstValue, secondValue, thirdValue);
    }
}
