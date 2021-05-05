package com.findmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {


    //    Test cases for Integer Maximum.
    @Test
    public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
        FindMaximum findMaximum = new FindMaximum();
        Integer result = findMaximum.maximum(3, 4, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
        FindMaximum findMaximum = new FindMaximum();
        Integer result = findMaximum.maximum(3, 5, 4);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
        FindMaximum findMaximum = new FindMaximum();
        Integer result = findMaximum.maximum(5, 3, 4);
        Assertions.assertEquals(5, result);
    }

    //    Test cases for Floats Maximum
    @Test
    public void givenMaximumFloatAtPosition1_ShouldReturnFloatOfPosition1() {
        FindMaximum findMaximum = new FindMaximum();
        Double result = findMaximum.maximum(3.3, 4.4, 5.44);
        Assertions.assertEquals(5.44, result);
    }

    @Test
    public void givenMaximumFloatAtPosition2_ShouldReturnFloatOfPosition2() {
        FindMaximum findMaximum = new FindMaximum();
        Double result = findMaximum.maximum(3.3, 5.55, 4.4);
        Assertions.assertEquals(5.55, result);
    }

    @Test
    public void givenMaximumFloatAtPosition3_ShouldReturnFloatOfPosition3() {
        FindMaximum findMaximum = new FindMaximum();
        Double result = findMaximum.maximum(5.55, 3.33, 4.44);
        Assertions.assertEquals(5.55, result);
    }

    //    Test cases for String Maximum
    @Test
    public void givenMaximumStringAtPosition1_ShouldReturnStringOfPosition1() {
        FindMaximum findMaximum = new FindMaximum();
        String result = findMaximum.maximum("Peach","Apple","Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenMaximumStringAtPosition2_ShouldReturnStringOfPosition2() {
        FindMaximum findMaximum = new FindMaximum();
        String result = findMaximum.maximum("Apple","Peach","Banana");
        Assertions.assertEquals("Peach", result);
    }

    @Test
    public void givenMaximumStringAtPosition3_ShouldReturnStringOfPosition3() {
        FindMaximum findMaximum = new FindMaximum();
        String result = findMaximum.maximum("Banana","Apple","Peach");
        Assertions.assertEquals("Peach", result);
    }
}
