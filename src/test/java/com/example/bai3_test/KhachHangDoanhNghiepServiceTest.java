package com.example.bai3_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangDoanhNghiepServiceTest {
    KhachHangDoanhNghiepService khachHangDoanhNghiepService = new KhachHangDoanhNghiepService();

    @Test
    public void testThem() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "Lâm", "KH01", "xuanhai@gmail.com");
        Assertions.assertEquals("Thêm Thành công",khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
    }
    @Test
    public void testTimKiem() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "Lâm", "KH01", "xuanhai@gmail.com");
        khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep);
        Assertions.assertEquals(1,khachHangDoanhNghiepService.timKiem("NV01").size());
    }
    @Test
    public void testThemTrong() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("", "Hải", "Lâm", "KH01", "xuanhai@gmail.com");
        Exception exception=assertThrows(IllegalArgumentException.class,()->khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
        assertEquals("Không được để trống",exception.getMessage());
    }
    @Test
    public void testThemTrong1() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "", "Lâm", "KH01", "xuanhai@gmail.com");
        Exception exception=assertThrows(IllegalArgumentException.class,()->khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
        assertEquals("Không được để trống",exception.getMessage());
    }
    @Test
    public void testThemTrong2() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "", "KH01", "xuanhai@gmail.com");
        Exception exception=assertThrows(IllegalArgumentException.class,()->khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
        assertEquals("Không được để trống",exception.getMessage());
    }
    @Test
    public void testThemTrong3() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "Lâm", "", "xuanhai@gmail.com");
        Exception exception=assertThrows(IllegalArgumentException.class,()->khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
        assertEquals("Không được để trống",exception.getMessage());
    }
    @Test
    public void testThemTrong4() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "Lâm", "KH01", "");
        Exception exception=assertThrows(IllegalArgumentException.class,()->khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
        assertEquals("Không được để trống",exception.getMessage());
    }
    @Test
    public void testThemTrong5() {
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("KH01", "Hải", "Lâm", "KH01", "xuanhai@gmail.com");
        Assertions.assertEquals("Thêm mã phải băt đầu băng NV",khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep));
    }
    @Test
    public void  testSua(){
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "Lâm", "KH01", "xuanhai@gmail.com");
        khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep);
        KhachHangDoanhNghiep khachHangDoanhNghiep1 = new KhachHangDoanhNghiep("NV01", "Khà", "Lâm", "KH01", "xuanhai@gmail.com");
        assertEquals("Cập nhật thành công",khachHangDoanhNghiepService.sua("NV01",khachHangDoanhNghiep1));
    }
    @Test
    public void  testSuaKtimThay(){

        KhachHangDoanhNghiep khachHangDoanhNghiep1 = new KhachHangDoanhNghiep("NV01", "Khà", "Lâm", "KH01", "xuanhai@gmail.com");
        assertEquals("Không tìm thấy khách hàng",khachHangDoanhNghiepService.sua("NV01",khachHangDoanhNghiep1));
    }
    @Test
    public void  testXoa(){
        KhachHangDoanhNghiep khachHangDoanhNghiep = new KhachHangDoanhNghiep("NV01", "Hải", "Lâm", "KH01", "xuanhai@gmail.com");
        khachHangDoanhNghiepService.themKH(khachHangDoanhNghiep);
        assertEquals("Xóa thành công",khachHangDoanhNghiepService.xoa("NV01"));
    }
    @Test
    public void  testXoaKTC(){
        assertEquals("Không tìm thấy khách hàng",khachHangDoanhNghiepService.xoa("NV01"));
    }

}