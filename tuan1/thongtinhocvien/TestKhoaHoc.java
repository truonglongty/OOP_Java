package tuan1.thongtinhocvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestKhoaHoc {
    public static void main(String[] args) {
    	// Khởi tạo danh sách khóa học
        List<ThongTinKhoaHoc> danhSachKhoaHoc = new ArrayList<>();

        ThongTinHocVien hv1 = new ThongTinHocVien("Trương Long Tý", "An Giang", "0363608504");
        ThongTinHocVien hv2 = new ThongTinHocVien("Nguyễn Văn A", "Tp HCM", "0123456789");
        ThongTinKhoaHoc kh = new ThongTinKhoaHoc("Toeic", LocalDate.of(2023, 9, 2), "7:00 - 9:00");

        kh.addHocVien(hv1);
        kh.addHocVien(hv2);
        kh.addHocVien(new ThongTinHocVien("Trần Thị B", "Đà Nẵng", "0987654321"));
        System.out.println(kh.getTieuDe());
        System.out.println("----------------------------------------------------------------------");
        System.out.println(kh);

        // Thêm khóa học vào danh sách
        danhSachKhoaHoc.add(kh);

        // Kiểm tra hv1 có trong khóa học hay không
        System.out.println(kh.daHocKH(hv1));

        // Kiểm tra khóa học chưa bắt đầu
        System.out.println(kh.khoaHocChuaBatDau());

        // Tìm khóa học theo tên
        String tenKhoaHocCanTim = "Toeic";
        ThongTinKhoaHoc khoaHocTimThay = ThongTinKhoaHoc.timKhoaHocTheoTen(danhSachKhoaHoc, tenKhoaHocCanTim);

        if (khoaHocTimThay != null) {
            System.out.println("\nKhóa học '" + tenKhoaHocCanTim + "' được tìm thấy:");
            System.out.println(khoaHocTimThay.getTieuDe());
        } else {
            System.out.println("\nKhông tìm thấy khóa học '" + tenKhoaHocCanTim + "'");
        }

        // Xác định các khóa học chưa kết thúc
        System.out.println("\nDanh sách khóa học chưa kết thúc:");
        for (ThongTinKhoaHoc khoc : danhSachKhoaHoc) {
            if (khoc.khoaHocChuaKetThuc()) {
                System.out.println(khoc.getTieuDe());
            }
        }
        
    }
}
