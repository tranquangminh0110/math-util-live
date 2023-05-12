/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Minh
 */
// TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN TÍCH CHO NƠI KHÁC XÀI
// KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ CHO RIÊNG TA
// VÀ HÀM STATIC GIÚP LÀM ĐIỀU NÀY  
public class MathUtil {

    //n! = 1.2.3.4.5.6.7.8.9...n
    //Quy ước: 0! = 1! = 1 
    //Ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long trong data chỉ tối đa 18 số 0
    //nếu đưa vào âm , 21 giao thừa, ta ko tính, ta đập vào mặt ai xài hàm này 
    //một exception, chửi
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument,...");
        }
        //hàm dừng liền éo cần return 

        //xuống đây là n = 0..20 
        if (n == 0 || n == 1) {
            return 1; //dừng ngay khi n đặc biệt 
        }
        //xuống đến đây, n = 2..20 
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        // i = 2, i = 3, i = 4, i = 5, i = n
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
            // nhân từ 2 dến n 
        }
        return product;
    }

  
}
