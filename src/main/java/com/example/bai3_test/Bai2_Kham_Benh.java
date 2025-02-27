package com.example.bai3_test;

public class Bai2_Kham_Benh {
    public  double tinhPhiKham(Boolean isVip,int soGioKham){
        if(soGioKham<=0){
            throw new IllegalArgumentException("Số Giờ khám không hợp lệ");

        }
        double phiCoBan=0;
        if(isVip==true){
            phiCoBan=500;
        }else {
            phiCoBan=300;
        }
        return phiCoBan*soGioKham;
    }
    public String TrangThai(String status){
        if(status.equalsIgnoreCase("dat")){
            return "Đã đặt";
        }else if(status.equalsIgnoreCase("HoanThanh")){
            return "Đã hoàn Thành";
        }if(status.equalsIgnoreCase("huy")){
            return "Đã hủy";
        }else {
//            return "Trạng Thái Không hợp lệ";
            throw new IllegalArgumentException("Trạng Thái Không hợp lệ");
        }
    }
}
