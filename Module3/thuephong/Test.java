package Module3.thuephong;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		DanhSachHoaDon list = new DanhSachHoaDon();
		list.them(new HoaDonTheoGio("HDG001", LocalDate.of(2023, 10, 15), "KhachHang1", "Phong101", 10.0, 12));
		list.them(new HoaDonTheoGio("HDG002", LocalDate.of(2023, 10, 16), "KhachHang2", "Phong102", 15.0, 28));
		list.them(new HoaDonTheoGio("HDG003", LocalDate.of(2023, 10, 17), "KhachHang3", "Phong103", 12.0, 5));
		list.them(new HoaDonTheoNgay("HDN001", LocalDate.of(2023, 10, 15), "KhachHang4", "Phong104", 50.0, 5));
		list.them(new HoaDonTheoNgay("HDN002", LocalDate.of(2023, 10, 16), "KhachHang5", "Phong105", 45.0, 8));
		list.them(new HoaDonTheoNgay("HDN003", LocalDate.of(2023, 10, 17), "KhachHang6", "Phong106", 60.0, 12));
		
		Scanner sc = new Scanner(System.in);

		while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm hóa đơn theo giờ");
            System.out.println("2. Thêm hóa đơn theo ngày");
            System.out.println("3. Thống kê số lượng hóa đơn theo giờ");
            System.out.println("4. Thống kê số lượng hóa đơn theo ngày");
            System.out.println("5. Tính tổng thành tiền theo tháng và năm");
            System.out.println("6. Hiển thị danh sách hóa đơn");
            System.out.println("0. Thoát");

            System.out.print("Chọn chức năng (0-6): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Nhập mã hóa đơn: ");
                String maHD = sc.next();
                System.out.println("Nhập ngày nhập");
				System.out.println("Nhập ngày: ");
				int day = sc.nextInt();
				System.out.println("Nhập tháng: ");
				int month = sc.nextInt();
				System.out.println("Nhập year: ");
				int year = sc.nextInt();
				sc.nextLine();
                System.out.print("Nhập tên khách hàng: ");
                String tenKH = sc.next();
                sc.nextLine();
                System.out.print("Nhập đơn giá: ");
                double donGia = sc.nextDouble();
                System.out.print("Nhập số giờ thuê: ");
                double soGioThue = sc.nextDouble();

                list.them(new HoaDonTheoGio(maHD, LocalDate.of(year, month, day), tenKH, tenKH, donGia, soGioThue));
            } 
            else if (choice == 2) {
            	System.out.print("Nhập mã hóa đơn: ");
                String maHD = sc.next();
                System.out.println("Nhập ngày nhập");
				System.out.println("Nhập ngày: ");
				int day = sc.nextInt();
				System.out.println("Nhập tháng: ");
				int month = sc.nextInt();
				System.out.println("Nhập year: ");
				int year = sc.nextInt();
				sc.nextLine();
                System.out.print("Nhập tên khách hàng: ");
                String tenKH = sc.next();
                sc.nextLine();
                System.out.print("Nhập đơn giá: ");
                double donGia = sc.nextDouble();
                System.out.print("Nhập số ngày thuê: ");
                int soNgayThue = sc.nextInt();

                list.them(new HoaDonTheoNgay(maHD, LocalDate.of(year, month, day), tenKH, tenKH, donGia, soNgayThue));
            } 
            else if (choice == 3) {
                int soLuongHDTheoGio = list.thongKeSoLuongHDTheoGio();
                System.out.println("Số lượng hóa đơn theo giờ: " + soLuongHDTheoGio);
            } 
            else if (choice == 4) {
                int soLuongHDTheoNgay = list.thongKeSoLuongHDTheoNgay();
                System.out.println("Số lượng hóa đơn theo ngày: " + soLuongHDTheoNgay);
            } 
            else if (choice == 5) {
                System.out.print("Nhập tháng (1-12): ");
                int thang = sc.nextInt();
                System.out.print("Nhập năm: ");
                int nam = sc.nextInt();
                double tongThanhTienThang = list.tinhTongThanhTien(thang, nam);
                System.out.println("Tổng thành tiền tháng " + thang + "/" + nam + ": " + tongThanhTienThang);
            } 
            else if (choice == 6) {
                System.out.println(list);
            } 
            else if (choice == 0) {
                break;
            }
            else {
                System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                
            }
        }
	}
}
