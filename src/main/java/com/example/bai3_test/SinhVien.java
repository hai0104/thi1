package com.example.bai3_test;

import lombok.*;

@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
    //Tạo class SinhVien gồm các thuộc tính maSV - String , ten - String ,
    //tuoi - int, diemTrungBinh - float, kyHoc - int, chuyenNganh - String
    private String maSV;
    private String ten;
    private int tuoi;
    private int diemTrungBinh;
    private int kyHoc;
    private String chuyenNganh;
}
