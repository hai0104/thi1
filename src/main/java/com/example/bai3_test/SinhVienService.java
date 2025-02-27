package com.example.bai3_test;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> list = new ArrayList<>();

    public String add(SinhVien sinhVien) {

        list.add(sinhVien);
        return "Thêm Thành Công";

    }

    public String update(String maSV, SinhVien sinhVien) {
        if (sinhVien.getTen().isBlank() || sinhVien.getTuoi() < 0 ||
                sinhVien.getDiemTrungBinh() < 0 || sinhVien.getDiemTrungBinh() > 10 || sinhVien.getKyHoc() < 0 ||
                sinhVien.getChuyenNganh().isBlank()) {
            throw new IllegalArgumentException("Không được bỏ trống");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMaSV().equalsIgnoreCase(maSV)) {
                    list.set(i, sinhVien);
                    return "Cập nhật thành công";
                }
            }
            return "Không tìm thấy";
        }
    }
}
