package com.example.bai3_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai6_SoLeTest {
    Bai6_SoLe bai6SoLe = new Bai6_SoLe();
    @Test
    public void test_1(){
        assertTrue(bai6SoLe.soLe(3));
    }
    @Test
    public void test_2(){
        assertFalse(bai6SoLe.soLe(4));
    }
    @Test
    public void test_3(){
        assertFalse(bai6SoLe.soLe(-4));
    }
    @Test
    public void test_4(){
        assertTrue(bai6SoLe.soLe(-3));
    }
    @Test
    public void test_5(){
        assertFalse(bai6SoLe.soLe(0));//0 ko phải số lẻ
    }

}