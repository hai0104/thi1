package com.example.bai3_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Bai1_MangTest {
    Bai1_Mang bai1 = new Bai1_Mang();
    @Test
    public void testMR(){
        Assertions.assertEquals(0,bai1.sunArray(new int[]{}),"Mảng rỗng trả về 0");
    }
    @Test
    public void testCN(){
        Assertions.assertEquals(5,bai1.sunArray(new int[]{5}),"Tổng phần tử bằng chính nó");
    }
    @Test
    public void testD(){
        Assertions.assertEquals(10,bai1.sunArray(new int[]{5,2,3}),"Tổng phần tử bằng dương");
    }
    @Test
    public void testA(){
        Assertions.assertEquals(-10,bai1.sunArray(new int[]{-5,-2,-3}),"Tổng phần tử bằng âm");
    }
    @Test
    public void testK(){
        Assertions.assertEquals(7,bai1.sunArray(new int[]{5,0,2}),"Tổng phần tử số 0 ko anh hưởng đến kết quả");
    }
}