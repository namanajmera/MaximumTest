package com.findmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {


    //    Test cases for Integer Maximum.
    @Test
    public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
//        FindMaximum findMaximum = new FindMaximum();
        Integer result = FindMaximum.maximum(5, 3, 4);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
//        FindMaximum findMaximum = new FindMaximum();
        Integer result = FindMaximum.maximum(3, 5, 4);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
//        FindMaximum findMaximum = new FindMaximum();
        Integer result = FindMaximum.maximum(3, 4, 5);
        Assertions.assertEquals(5, result);
    }

    //    Test cases for Floats Maximum
    @Test
    public void givenMaximumFloatAtPosition1_ShouldReturnFloatOfPosition1() {
//        FindMaximum findMaximum = new FindMaximum();
        Float result = FindMaximum.maximum(5.44f, 3.33f, 4.44f);
        Assertions.assertEquals(5.44f, result);
    }

    @Test
    public void givenMaximumFloatAtPosition2_ShouldReturnFloatOfPosition2() {
//        FindMaximum findMaximum = new FindMaximum();
        Float result = FindMaximum.maximum(3.3f, 5.55f, 4.4f);
        Assertions.assertEquals(5.55f, result);
    }

    @Test
    public void givenMaximumFloatAtPosition3_ShouldReturnFloatOfPosition3() {
//        FindMaximum findMaximum = new FindMaximum();
        Float result = FindMaximum.maximum(4.44f, 3.33f, 5.55f);
        Assertions.assertEquals(5.55f, result);
    }

    //    Test cases for String Maximum
    @Test
    public void givenMaximumStringAtPosition1_ShouldReturnStringOfPosition1() {
//        FindMaximum findMaximum = new FindMaximum();
        String result = FindMaximum.maximum("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenMaximumStringAtPosition2_ShouldReturnStringOfPosition2() {
//        FindMaximum findMaximum = new FindMaximum();
        String result = FindMaximum.maximum("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenMaximumStringAtPosition3_ShouldReturnStringOfPosition3() {
//        FindMaximum findMaximum = new FindMaximum();
        String result = FindMaximum.maximum("Banana", "Apple", "Peach");
        Assertions.assertEquals("Peach", result);
    }

    //    For Generic Results
    @Test
    public <T extends Comparable<T>> void givenMaximumGenericIntegerAt_ShouldReturnGenericInteger() {
//        FindMaximum findMaximum = new FindMaximum();
        T result = (T) FindMaximum.maximum(5, 4, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public <T extends Comparable<T>> void givenMaximumGenericFloatAt_ShouldReturnGenericFloat() {
//        FindMaximum findMaximum = new FindMaximum();
        T result = (T) FindMaximum.maximum(3.33f, 4.44f, 5.55f);
        Assertions.assertEquals(5.55f, result);
    }

    @Test
    public <T extends Comparable<T>> void givenMaximumGenericStringAt_ShouldReturnGenericString() {
//        FindMaximum findMaximum = new FindMaximum();
        T result = (T) FindMaximum.maximum("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    //   New Test Cases --  Using Generics Class
    @Test
    public void givenGenericIntegerValue_ShouldReturnMaximumIntegerValue() {
        FindMaximum<Integer> integerFindMaximum = new FindMaximum<Integer>(3, 4, 5);
        Integer result = integerFindMaximum.testMaximum();
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenGenericFloatValue_ShouldReturnMaximumFloatValue() {
        FindMaximum<Float> floatFindMaximum = new FindMaximum<>(5.55f, 4.44f, 3.33f);
        Float result = floatFindMaximum.testMaximum();
        Assertions.assertEquals(5.55f, result);
    }

    @Test
    public void givenGenericStringValue_ShouldReturnMaximumStringValue() {
        FindMaximum<String> stringFindMaximum = new FindMaximum<>("Apple", "Peach", "Banana");
        String result = stringFindMaximum.testMaximum();
        Assertions.assertEquals("Peach", result);
    }
}
