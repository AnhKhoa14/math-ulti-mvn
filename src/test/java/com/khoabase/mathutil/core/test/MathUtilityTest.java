/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.khoabase.mathutil.core.test;

import com.khoabase.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 84868
 */
public class MathUtilityTest {
    
    //TEST CASE #1 - Verify getFactorial (with n = 0)
    //Step/Procedures
    //          1. Given n = 0
    //          2. Call/invoke getFactorial (n = 0)
    //Expected Result:
    //          The method must return 1 as the result of 0! = 1
    //Status: PASSED | FAILED chờ đến lúc runtime mới biết
    
    @Test
    public void verifyFactorialGivenArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
