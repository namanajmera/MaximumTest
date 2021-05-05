package com.findmaximum;

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
        return max;
    }

    public T testMaximum() {
        return maximum(firstValue, secondValue, thirdValue);
    }
}
