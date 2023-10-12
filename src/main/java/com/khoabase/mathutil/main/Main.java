/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.khoabase.mathutil.main;

import com.khoabase.mathutil.core.MathUtility;

/**
 *
 * @author 84868
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEST CASE #1: - xem ở dưới mô tả
        int n = 0; //given n -= 0, ý là muốn tính 0!
        long expected = 1; //ý muốn hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); //ý nói rằng hàm chạy ra mấy, invoke, call

        //so sánh giữa expected và actual
        System.out.println(n + "! = -> expected: " + expected + " | actual = " + actual);

        //TEST CASE #2:
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! = -> expected: " + expected + " | actual = " + actual);

        
        //TEST CASE #3:
        System.out.println("5! = -> expected: 120" + " | actual = " + MathUtility.getFactorial(5));

    }

}

//mình là DEV mình phải test code của mình ngon trước đã
//muốn test code hay test app (QC/tester) thì cần phải chuẩn bị
//test case - tình huống kiểm thử, trường hợp kiểm thử - cách ta kiểm thử trong 1 ngữ cảnh nào đó - bàn về bộ data
//1 test case có cấu trúc như sau:
//ID | Description | Steps/Procedures | Expected Result | Status (Passed/Failed)
//DEV em muốn kiểm thử coi hàm chính em viết getFactorial() đúng hay sai
// thì em phải thiết kế các test case

//TEST CASE #1: Verify getFactorial(with n = 0)
//Steps-Procedures: Các bước để run app
//      1. Given n = 0
//      2. Execute/Call/Invoke function getFactorial()
//Expected Result: the function must return 1 (standing for 0! = 1)
//Status: Passed or Failed, ai biết, chờ run app/hàm cái đã
//Run hàm, run app, đưa test data vào, được gọi là test run

//TEST CASE #2: Verify getFactorial(with n = 1)
//STEPS/PROCEDURES:         
//          1. Give n = 1
//          2. Call/invoke getFactorial (n = 1)
//EXPECTED RESULT:
//          the method must return 1 in case of 1!
//STATUS: PASSED/FAILED

//TEST CASE #3: Verify getFactorial(with n = 5)
//STEPS/PROCEDURES:         
//          1. Give n = 5
//          2. Call/invoke getFactorial (n = 5)
//EXPECTED RESULT:
//          the method must return 120 in case of 5!
//STATUS: PASSED/FAILED
