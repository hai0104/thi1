package com.example.bai3_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai5_Mu_Logarit_Can3Test {
    Bai5_Mu_Logarit_Can3 bai5MuLogaritCan3= new Bai5_Mu_Logarit_Can3();
    @Test
    public void testMu(){
        assertEquals(8,bai5MuLogaritCan3.power(2,3)); //2^3=8
        assertEquals(1,bai5MuLogaritCan3.power(5,0)); //5^0=8
    }
    @Test
    public void testLog(){

        assertEquals(0.7,bai5MuLogaritCan3.log(2),0.01); //log(2)=0.7
        // không hợp lệ
        Exception exception=assertThrows(IllegalArgumentException.class,()->bai5MuLogaritCan3.log(0));
        assertEquals("số không hợp lệ",exception.getMessage());
    }
    @Test
    public void testCan3(){

        assertEquals(3,bai5MuLogaritCan3.cubert(27),0.01); //log(2)=0.7

    }
}