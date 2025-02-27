package com.example.bai3_test;

import java.util.ArrayList;
import java.util.List;

public class KhachHangDoanhNghiepService {
    private List<KhachHangDoanhNghiep> list = new ArrayList<>();

    //    Tạo class KhachHangDoanhNghiep gồm các thuộc tính maKH - String,
//    tenCongTy - String, nguoiDaiDien - String, maSoThue - String, email - String.
    public String themKH(KhachHangDoanhNghiep khachHangDoanhNghiep) {
        if (khachHangDoanhNghiep.getMaKH().isBlank() || khachHangDoanhNghiep.getTenCongTy().isBlank() ||
                khachHangDoanhNghiep.getNguoiDaiDien().isBlank() || khachHangDoanhNghiep.getMaSoThue().isBlank()
                || khachHangDoanhNghiep.getEmail().isBlank()) {
            throw new IllegalArgumentException("Không được để trống");
        } else if (khachHangDoanhNghiep.getMaKH().startsWith("NV")) {
            list.add(khachHangDoanhNghiep);
            return "Thêm Thành công";
        } else {
            return "Thêm mã phải băt đầu băng NV";
        }
    }

    public List<KhachHangDoanhNghiep> timKiem(String maKH) {
        if (maKH == null || maKH.isBlank()) {
            throw new IllegalArgumentException("không được để trống");
        }
        List<KhachHangDoanhNghiep> kq = new ArrayList<>();
        for (KhachHangDoanhNghiep kh : list) {
            if (kh.getMaKH().equalsIgnoreCase(maKH)) {
                kq.add(kh);
            }
        }
        return kq;
    }

    public String sua(String maKH, KhachHangDoanhNghiep khachHangDoanhNghiep) {
        for (int i = 0; i < list.size(); i++) {// Duyệt qua danh sách khách hàng
            if (list.get(i).getMaKH().equalsIgnoreCase(maKH)) { // Tìm khách hàng có mã trùng khớp
                list.set(i, khachHangDoanhNghiep); // Cập nhật thông tin khách hàng tại vị trí đó
                return "Cập nhật thành công";  // Trả về thông báo thành công
            }
        }
        return "Không tìm thấy khách hàng";
    }

    public String xoa(String maKH) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaKH().equalsIgnoreCase(maKH)) {
                list.remove(i);
                return "Xóa thành công";
            }
        }
        return "Không tìm thấy khách hàng";
    }

}
