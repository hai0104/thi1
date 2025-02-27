package com.example.bai3_test;

import lombok.*;

@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangDoanhNghiep {
//    Tạo class KhachHangDoanhNghiep gồm các thuộc tính maKH - String,
//    tenCongTy - String, nguoiDaiDien - String, maSoThue - String, email - String.
    private String maKH;
    private String tenCongTy;
    private String nguoiDaiDien;
    private String maSoThue;
    private String email;

}
