package com.example.bai3_test;

public class Bai4_CanBac2SoNguyen {
    public double sprt(int number){
        if(number<0){
            throw new IllegalArgumentException("Số không được âm");

        }
        return Math.sqrt(number);
    }
}
