/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Input here: ");
        input = sc.nextInt();
        System.out.println("Your number: "+ MathUtil.getFactorial(input));
        
        //Them code sau lan dau lam chuyen ay 7:21PM
        System.out.println("hihihihihihihihihi");
        
    }

}
