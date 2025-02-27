package com.example.bai3_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    SinhVienService sinhVienService= new SinhVienService();
    @Test
    public void testUp(){
        SinhVien sinhVien = new SinhVien("Sv01","Hải",12,8,2,"PTPM");
        sinhVienService.add(sinhVien);
        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",12,10,2,"PTPM");
        assertEquals("Cập nhật thành công",sinhVienService.update("Sv01",sinhVien1));
    }
    @Test
    public void testUpKTT(){

        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",12,8,2,"PTPM");
        assertEquals("Không tìm thấy",sinhVienService.update("Sv01",sinhVien1));
    }
    @Test
    public void testTrong(){
        SinhVien sinhVien1 = new SinhVien("Sv01","",12,21,2,"PTPM");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.update("Lâm",sinhVien1));
        assertEquals("Không được bỏ trống",exception.getMessage());
    }
    @Test
    public void testTrong1(){
        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",-1,21,2,"PTPM");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.update("Sv01",sinhVien1));
        assertEquals("Không được bỏ trống",exception.getMessage());
    }
    @Test
    public void testTrong2(){
        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",12,-1,2,"PTPM");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.update("Sv01",sinhVien1));
        assertEquals("Không được bỏ trống",exception.getMessage());
    }
    @Test
    public void testTrong3(){
        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",12,11,2,"PTPM");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.update("Sv01",sinhVien1));
        assertEquals("Không được bỏ trống",exception.getMessage());
    }
    @Test
    public void testTrong4(){
        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",12,9,-1,"PTPM");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.update("Sv01",sinhVien1));
        assertEquals("Không được bỏ trống",exception.getMessage());
    }
    @Test
    public void testTrong5(){
        SinhVien sinhVien1 = new SinhVien("Sv01","Lâm",12,9,1,"");
        Exception exception=assertThrows(IllegalArgumentException.class,()->sinhVienService.update("Sv01",sinhVien1));
        assertEquals("Không được bỏ trống",exception.getMessage());
    }

}