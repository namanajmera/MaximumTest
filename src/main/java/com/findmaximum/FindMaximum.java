package com.findmaximum;

public class FindMaximum {
//    public Integer maximum(Integer num1, Integer num2, Integer num3) {
//        Integer max = num1;
//        if (num2.compareTo(max) > 0) {
//            max = num2;
//        }
//        if (num3.compareTo(max) > 0) {
//            max = num3;
//        }
//        return max;
//    }
//
//    public Float maximum(Float num1, Float num2, Float num3) {
//        Float max = num1;
//        if (num2.compareTo(max) > 0) {
//            max = num2;
//        }
//        if (num3.compareTo(max) > 0) {
//            max = num3;
//        }
//        return max;
//    }
//
//    public String maximum(String value1, String value2, String value3) {
//        String max = value1;
//        if (value2.compareTo(max) > 0) {
//            max = value2;
//        }
//        if (value3.compareTo(max) > 0) {
//            max = value3;
//        }
//        return max;
//    }

    //    Convert to Generic Method.
    public <T extends Comparable<T>> T maximum(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }
}
