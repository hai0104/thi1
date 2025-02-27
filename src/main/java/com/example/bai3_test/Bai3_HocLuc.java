package com.example.bai3_test;

public class Bai3_HocLuc {
    public double Ave(double[] score) {
        if (score.length == 0) return 0;
        double sum = 0;
        for (double cv : score) {
            sum += cv;
        }
        return sum / score.length;
    }

    public String tong(Double diem) {
        if (diem >= 0 && diem <= 10) {
            if (diem >= 8) {
                return "Giỏi";
            } else if (diem >= 6) {
                return "Khá";
            } else if (diem >= 5) {
                return "Trung bình";
            } else {
                return "yếu";
            }
        } else {
            throw new IllegalArgumentException("Điểm Không hợp lệ");
        }
    }
}
