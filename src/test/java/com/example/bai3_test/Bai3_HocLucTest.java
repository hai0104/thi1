package com.example.bai3_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai3_HocLucTest {
    Bai3_HocLuc bai3HocLuc = new Bai3_HocLuc();
    @Test
    public void testAve(){
        Assertions.assertEquals(8,bai3HocLuc.Ave(new double[]{7,8,9}));
//        Delta trong test JUnit là gì?
//        Trong JUnit, tham số delta được sử dụng trong assertEquals(expected, actual, delta)
//        để xác định mức sai số chấp nhận được khi so sánh hai số thực (float hoặc double).
        // cận trên
        Assertions.assertEquals(10,bai3HocLuc.Ave(new double[]{10,10,10}),0.01);
//        cân dưới
        Assertions.assertEquals(0.7,bai3HocLuc.Ave(new double[]{1,1,0.1}),0.01);
        // không có dữ liệu
        Assertions.assertEquals(0,bai3HocLuc.Ave(new double[]{}),0.01);
    }
    @Test
    public void testHocLuc(){
        //        cân dưới
        Assertions.assertEquals("Giỏi",bai3HocLuc.tong(8.0));
        Assertions.assertEquals("Khá",bai3HocLuc.tong(6.0));
        Assertions.assertEquals("Trung bình",bai3HocLuc.tong(5.0));
        Assertions.assertEquals("yếu",bai3HocLuc.tong(1.0));
        // cận trên
        Assertions.assertEquals("Giỏi",bai3HocLuc.tong(9.5));
        Assertions.assertEquals("Khá",bai3HocLuc.tong(7.9));
        Assertions.assertEquals("Trung bình",bai3HocLuc.tong(5.9));
        Assertions.assertEquals("yếu",bai3HocLuc.tong(4.9));
    }
    @Test
    public void testHocLucNL(){

       Exception exception= assertThrows(IllegalArgumentException.class,()->bai3HocLuc.tong(-1.0));
       assertEquals("Điểm Không hợp lệ",exception.getMessage());
        Exception exception1= assertThrows(IllegalArgumentException.class,()->bai3HocLuc.tong(11.0));
        assertEquals("Điểm Không hợp lệ",exception1.getMessage());
    }
}