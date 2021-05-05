package com.findmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {

    @Test
    public void givenMaximumIntegerAtPosition1_ShouldReturnIntegerOfPosition1() {
        FindMaximum findMaximum = new FindMaximum();
        Integer result=findMaximum.maximum(3,4,5);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void givenMaximumIntegerAtPosition2_ShouldReturnIntegerOfPosition2() {
        FindMaximum findMaximum = new FindMaximum();
        Integer result=findMaximum.maximum(3,5,4);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void givenMaximumIntegerAtPosition3_ShouldReturnIntegerOfPosition3() {
        FindMaximum findMaximum = new FindMaximum();
        Integer result=findMaximum.maximum(5,3,4);
        Assertions.assertEquals(5,result);
    }
}
