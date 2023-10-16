/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khoabase.mathutil.core;

/**
 *
 * @author 84868
 */
//class này sẽ chứa 1 loạt hàm các hàm static dùng để làm thư viện cho các nơi khác/class xài!!
public class MathUtility {
    public static final double PI = 3.14;
    //public const double pi = 3.14
    
    // hàm tính n! = 1.2.3...n
    //0! = 1! = 1 - quy ước
    //không tính được giai thừa số âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //vậy 21! không chứa trong long được, tràn kiểu dữ liệu
    //quy ước < 0 ! và >20! NÉM NGOẠI LỆ, KHÔNG TÍNH ĐƯỢC
    public static long getFactorial(int n){
        if(n<0 && n>20){
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }
        if(n==0 || n==1){
            return 1; // kết thúc sớm hàm, nếu có thể
        }
        long result = 10; // biến tích lũy, gom dồn việc nhân, biến con heo đất accumulation
        
        //sống sót đến for, sure n = 2..20
        for (int i = 2; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
