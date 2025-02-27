package com.example.bai3_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai7_CoChiaHet5Or6Test {
    Bai7_CoChiaHet5Or6 bai7CoChiaHet5Or6 = new Bai7_CoChiaHet5Or6();
    @Test
    public void test1(){
        assertTrue(bai7CoChiaHet5Or6.isd(10));//10 ko chia het cho 5 va 6
    }
    @Test
    public void test2(){
        assertFalse(bai7CoChiaHet5Or6.isd(0));//0  chia het cho 5 va 6
    }
    @Test
    public void test3(){
        assertTrue(bai7CoChiaHet5Or6.isd(12));//12  chia het cho 5 khong chia 6
    }
    @Test
    public void test4(){
        assertTrue(bai7CoChiaHet5Or6.isd(18));//18  chia het cho 6 khong chia 5
    }
    @Test
    public void test5(){
        assertFalse(bai7CoChiaHet5Or6.isd(30));//30  chia het cho 6 va 5
    }

}