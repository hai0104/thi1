package com.example.bai3_test;

public class Bai5_Mu_Logarit_Can3 {
    // Hàm tính lũy thừa (power), logarit (log), căn bậc ba (cubert)
    //lũy thừa (power),
    public double power(int base,int exponent){
        return Math.pow(base,exponent);
    }
    //logarit (log)
    public double log(int number){
        if(number<=0){
            throw new IllegalArgumentException("số không hợp lệ");
        }
        return Math.log(number);
    }
    //căn bậc ba (cubert)
    public double cubert(int number){
        return Math.cbrt(number);
    }
}
