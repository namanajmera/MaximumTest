package com.findmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {


    //    Test cases for Integer Maximum.
    @Test
    public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
        Integer result = FindMaximum.maximum(5, 3, 4);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
        Integer result = FindMaximum.maximum(3, 5, 4);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
        Integer result = FindMaximum.maximum(3, 4, 5);
        Assertions.assertEquals(5, result);
    }

    //    Test cases for Floats Maximum
    @Test
    public void givenMaximumFloatAtPosition1_ShouldReturnFloatOfPosition1() {
        Float result = FindMaximum.maximum(5.44f, 3.33f, 4.44f);
        Assertions.assertEquals(5.44f, result);
    }

    @Test
    public void givenMaximumFloatAtPosition2_ShouldReturnFloatOfPosition2() {
        Float result = FindMaximum.maximum(3.3f, 5.55f, 4.4f);
        Assertions.assertEquals(5.55f, result);
    }

    @Test
    public void givenMaximumFloatAtPosition3_ShouldReturnFloatOfPosition3() {
        Float result = FindMaximum.maximum(4.44f, 3.33f, 5.55f);
        Assertions.assertEquals(5.55f, result);
    }

    //    Test cases for String Maximum
    @Test
    public void givenMaximumStringAtPosition1_ShouldReturnStringOfPosition1() {
        String result = FindMaximum.maximum("Peach", "Apple", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenMaximumStringAtPosition2_ShouldReturnStringOfPosition2() {
        String result = FindMaximum.maximum("Apple", "Peach", "Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenMaximumStringAtPosition3_ShouldReturnStringOfPosition3() {
        String result = FindMaximum.maximum("Banana", "Apple", "Peach");
        Assertions.assertEquals("Peach", result);
    }

    //    For Generic Results
    @Test
    public <T extends Comparable<T>> void givenMaximumGenericIntegerAt_ShouldReturnGenericInteger() {
        T result = (T) FindMaximum.maximum(5, 4, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public <T extends Comparable<T>> void givenMaximumGenericFloatAt_ShouldReturnGenericFloat() {
        T result = (T) FindMaximum.maximum(3.33f, 4.44f, 5.55f);
        Assertions.assertEquals(5.55f, result);
    }

    @Test
    public <T extends Comparable<T>> void givenMaximumGenericStringAt_ShouldReturnGenericString() {
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

    //    Putting Multiple Values to check maximum
    @Test
    public void givenMultipleIntegersValue_ShouldReturnMaximumIntegerValue() {
        Integer result = FindMaximum.maximum(1, 2, 3, 4, 5, 6, 5, 4, 8, 7, 12, 543, 85, 23, 85, 123, 98);
        Assertions.assertEquals(543, result);
    }

    @Test
    public void givenMultipleFloatValue_ShouldReturnMaximumFloatValue() {
        Float result = FindMaximum.maximum(1.12f, 2.23f, 3.42f, 4.7f, 5.54f, 6.54f, 5.76f, 4.544f, 85.54f, 23.43f, 85.56f, 123.54f, 98.4f);
        Assertions.assertEquals(123.54f, result);
    }

    @Test
    public void givenMultipleStringValue_ShouldReturnMaximumStringValue() {
        String result = FindMaximum.maximum("Apple","Peach","Banana","Pineapple","Grapes","Black Berry","Mango","Watermelon");
        Assertions.assertEquals("Watermelon", result);
    }

//    Printing the maximum value

    @Test
    public void givenValueInteger_ShouldReturnMaximumIntegerAndPrintMaximum() {
        FindMaximum<Integer> integerFindMaximum=new FindMaximum<>(1,2,3);
        Integer result = integerFindMaximum.printMax();
        Assertions.assertEquals(3, result);
    }

    @Test
    public void givenValueFloat_ShouldReturnMaximumFloatAndPrintMaximum() {
        FindMaximum<Float> floatFindMaximum=new FindMaximum<>(1.33f,2.43f,4.44f);
        Float result = floatFindMaximum.printMax();
        Assertions.assertEquals(4.44f, result);
    }

    @Test
    public void givenValueString_ShouldReturnMaximumStringAndPrintMaximum() {
        FindMaximum<String> stringFindMaximum=new FindMaximum<>("Apple", "Peaches","Banana");
        String result = stringFindMaximum.printMax();
        Assertions.assertEquals("Peaches", result);
    }
}
