package com.training.project1;

import org.junit.Test;
import org.junit.Assert;
import com.training.project1.MathLibrary;

public class MathLibraryTest {
    
    @Test //JUNIT Annotation
    public void test_givenA5AndA10_whenWeSumThem_then15IsReturned(){
        int number1=5;
        int number2=10;
        int result=MathLibrary.sum(number1,number2);
        // Please JAVA, make sure that the result returned above is 15
        Assert.assertEquals(15,result); // THIS IS A TEST !!!!!!!!!
    }
    
    @Test //JUNIT Annotation
    public void test_givenA5AndA0_whenWeSumThem_then5IsReturned(){
        int number1=5;
        int number2=0;
        int result=MathLibrary.sum(number1,number2);
        // Please JAVA, make sure that the result returned above is 15
        Assert.assertEquals(5,result); // THIS IS A TEST !!!!!!!!!
    }
    
    @Test //JUNIT Annotation
    public void test_givenA0AndA10_whenWeSumThem_then10IsReturned(){
        int number1=0;
        int number2=10;
        int result=MathLibrary.sum(number1,number2);
        // Please JAVA, make sure that the result returned above is 15
        Assert.assertEquals(10, result); // THIS IS A TEST !!!!!!!!!
    }
    
    @Test //JUNIT Annotation
    public void test_givenANegative5AndA10_whenWeSumThem_then5IsReturned(){
        int number1=-5;
        int number2=10;
        int result=MathLibrary.sum(number1,number2);
        // Please JAVA, make sure that the result returned above is 15
        Assert.assertEquals(5,result); // THIS IS A TEST !!!!!!!!!
    }
    
    @Test //JUNIT Annotation
    public void test_givenA5AndANegative10_whenWeSumThem_thenNegative5IsReturned(){
        int number1=5;
        int number2=-10;
        int result=MathLibrary.sum(number1,number2);
        // Please JAVA, make sure that the result returned above is 15
        Assert.assertEquals(-5,result); // THIS IS A TEST !!!!!!!!!
    }
    
    
}