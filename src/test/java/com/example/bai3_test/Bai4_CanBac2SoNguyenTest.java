package com.example.bai3_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai4_CanBac2SoNguyenTest {
    Bai4_CanBac2SoNguyen bai4CanBac2SoNguyen= new Bai4_CanBac2SoNguyen();
    @Test
    public void  testN(){
        // cận dưới
        assertEquals(0,bai4CanBac2SoNguyen.sprt(0));
        assertEquals(1,bai4CanBac2SoNguyen.sprt(1));
        // phân vùng tương đương
        assertEquals(2,bai4CanBac2SoNguyen.sprt(4));
        assertEquals(3.17,bai4CanBac2SoNguyen.sprt(10),0.01);
        Exception exception=assertThrows(IllegalArgumentException.class,()->bai4CanBac2SoNguyen.sprt(-1));
        assertEquals("Số không được âm",exception.getMessage());

    }

}