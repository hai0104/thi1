package com.example.bai3_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bai2_Kham_BenhTest {
    Bai2_Kham_Benh bai2KhamBenh= new Bai2_Kham_Benh();
    @Test
    public void testGio(){
        Assertions.assertEquals(1500,bai2KhamBenh.tinhPhiKham(true,3));
        Assertions.assertEquals(900,bai2KhamBenh.tinhPhiKham(false,3));
    }
    @Test
    public void testGioNL(){
      Exception exception=  Assertions.assertThrows(IllegalArgumentException.class,()->bai2KhamBenh.tinhPhiKham(true,0));
      assertEquals("Số Giờ khám không hợp lệ",exception.getMessage());
    }
    @Test
    public void testTTHL(){
        Assertions.assertEquals("Đã hủy",bai2KhamBenh.TrangThai("Huy"));
        Assertions.assertEquals("Đã hoàn Thành",bai2KhamBenh.TrangThai("hoanThanh"));
        Assertions.assertEquals("Đã đặt",bai2KhamBenh.TrangThai("Dat"));
    }
    @Test
    public void testTTKHL(){
        Exception exception=  Assertions.assertThrows(IllegalArgumentException.class,()->bai2KhamBenh.TrangThai("hai"));
        assertEquals("Trạng Thái Không hợp lệ",exception.getMessage());
    }

}