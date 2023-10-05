package tuan1.diemhocvien;

import java.util.ArrayList;
import java.util.List;

public class TestDiemHocVien {
	public static void main(String[] args) {
		// Khởi tạo danh sách học viên
        List<DiemHocVien> diemHocVienList = new ArrayList<>();
        diemHocVienList.add(new DiemHocVien("Nguyễn Văn A", 2000, 8, 9, 10, 10, 10));
        diemHocVienList.add(new DiemHocVien("Trần Thị B", 2001, 6, 7, 7, 8, 9));
        diemHocVienList.add(new DiemHocVien("Lê Quang C", 2002, 5, 5, 5, 5, 5));

        // Tính điểm trung bình và xét kết quả học tập
        for (DiemHocVien diemHocVien : diemHocVienList) {
            diemHocVien.diemTB();
            diemHocVien.xetKetQua();
        }
        
        // Tính số lượng học viên theo từng kết quả học tập
        int soLuongLamLuanVan = 0;
        int soLuongThiTotNghiep = 0;
        int soLuongThiLai = 0;
        for (DiemHocVien diemHocVien : diemHocVienList) {
            switch (diemHocVien.xetKetQua()) {
                case "Làm luận văn":
                    soLuongLamLuanVan++;
                    break;
                case "Thi tốt nghiệp":
                    soLuongThiTotNghiep++;
                    break;
                default:
                    soLuongThiLai++;
            }
        }
        // In số lượng học viên theo từng kết quả
        System.out.println("Số lượng học viên làm luận văn: " + soLuongLamLuanVan);
        System.out.println("Số lượng học viên thi tốt nghiệp: " + soLuongThiTotNghiep);
        System.out.println("Số lượng học viên thi lại: " + soLuongThiLai);
        
     // In danh sách học viên thi lại
        for (DiemHocVien diemHocVien : diemHocVienList) {
            List<Integer> danhSachMonThiLai = diemHocVien.getDanhSachMonThiLai();
            if (!danhSachMonThiLai.isEmpty()) {
                System.out.println("Học viên " + diemHocVien.getHoTen() + " thi lại các môn sau:");
                for (int diem : danhSachMonThiLai) {
                    System.out.println("* Môn: " + diem);
                }
            }
        }
	}
}
