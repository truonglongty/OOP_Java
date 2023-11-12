package module4.quanlyphonghoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
        DanhSachPhongHoc ds = new DanhSachPhongHoc();
       
        ds.themPhongHoc(new PhongHocLyThuyet("LT001", "A", 50, 5, true));
        ds.themPhongHoc(new PhongMayTinh("MT001", "B", 30, 3, 20));
        ds.themPhongHoc(new PhongThiNghiem("TN001", "C", 40, 4, "Hóa học", 15, true));
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm kiếm phòng học");
            System.out.println("3. Hiển thị toàn bộ danh sách phòng học");
            System.out.println("4. Hiển thị danh sách phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách theo dãy nhà");
            System.out.println("6. Sắp xếp danh sách giảm dần theo diện tích");
            System.out.println("7. Sắp xếp danh sách tăng dần theo số bóng đèn");
            System.out.println("8. Cập nhật số máy tính cho phòng máy tính");
            System.out.println("9. Xóa phòng học");
            System.out.println("10. Tổng số phòng học");
            System.out.println("11. Danh sách phòng máy có 60 máy");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    // Thêm phòng học
                    System.out.println("Chọn loại phòng học: ");
                    System.out.println("1. Phòng học lý thuyết");
                    System.out.println("2. Phòng máy tính");
                    System.out.println("3. Phòng thí nghiệm");
                    int loaiPhong = sc.nextInt();
                    sc.nextLine(); // Đọc bỏ dòng trống

                    System.out.print("Nhập mã phòng: ");
                    String maPhong = sc.nextLine();
                    System.out.print("Nhập dãy nhà: ");
                    String dayNha = sc.nextLine();
                    System.out.print("Nhập diện tích: ");
                    double dienTich = sc.nextDouble();
                    System.out.print("Nhập số bóng đèn: ");
                    int soBongDen = sc.nextInt();

                    switch (loaiPhong) {
                        case 1:
                            System.out.print("Có máy chiếu hay không (true/false): ");
                            boolean coMayChieu = sc.nextBoolean();
                            PhongHocLyThuyet phongLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                            ds.themPhongHoc(phongLyThuyet);
                            break;
                        case 2:
                            System.out.print("Nhập số máy tính: ");
                            int soMayTinh = sc.nextInt();
                            PhongMayTinh phongMayTinh = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                            ds.themPhongHoc(phongMayTinh);
                            break;
                        case 3:
                            System.out.print("Nhập chuyên ngành: ");
                            String chuyenNganh = sc.nextLine();
                            System.out.print("Nhập sức chứa: ");
                            int sucChua = sc.nextInt();
                            System.out.print("Có bồn rửa không (true/false): ");
                            boolean coBonRua = sc.nextBoolean();
                            PhongThiNghiem phongThiNghiem = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
                            ds.themPhongHoc(phongThiNghiem);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;

                case 2:
                    // Tìm kiếm phòng học
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maPhongTimKiem = sc.nextLine();
                    PhongHoc phongTimKiem = ds.timKiem(maPhongTimKiem);
                    if (phongTimKiem != null) {
                        System.out.println("Thông tin phòng học: ");
                        System.out.println(phongTimKiem.toString());
                    } 
                    else 
                        System.out.println("Không tìm thấy phòng học có mã " + maPhongTimKiem);
                    break;

                case 3:
                    // Hiển thị toàn bộ danh sách phòng học
                    System.out.println("Danh sách phòng học:");
                    System.out.println(ds.getAllInfo());
                    break;

                case 4:
                    // Hiển thị danh sách phòng học đạt chuẩn
                    System.out.println("Danh sách phòng học đạt chuẩn:");
                    System.out.println(ds.getInfoDatChuan());
                    break;

                case 5:
                    // Sắp xếp danh sách theo dãy nhà
                    ds.sapTangDayNha();
                    System.out.println("Danh sách sau khi sắp xếp theo dãy nhà:");
                    System.out.println(ds.getAllInfo());
                    break;

                case 6:
                    // Sắp xếp danh sách giảm dần theo diện tích
                    ds.sapGiamDienTich();
                    System.out.println("Danh sách sau khi sắp xếp giảm dần theo diện tích:");
                    System.out.println(ds.getAllInfo());
                    break;

                case 7:
                    // Sắp xếp danh sách tăng dần theo số bóng đèn
                    ds.sapTangSoBongDen();
                    System.out.println("Danh sách sau khi sắp xếp tăng dần theo số bóng đèn:");
                    System.out.println(ds.getAllInfo());
                    break;

                case 8:
                    // Cập nhật số máy tính cho phòng máy tính
                    System.out.print("Nhập mã phòng máy tính cần cập nhật: ");
                    String maPhongCapNhat = sc.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = sc.nextInt();
                    boolean capNhatThanhCong = ds.capNhatSoMayTinh(maPhongCapNhat, soMayTinhMoi);
                    if (capNhatThanhCong) 
                        System.out.println("Cập nhật số máy tính thành công.");
                    else 
                        System.out.println("Không tìm thấy phòng máy tính có mã " + maPhongCapNhat);
                    break;
                    
                case 9:
                    // Xóa phòng học
                    System.out.print("Nhập mã phòng cần xóa: ");
                    String maPhongXoa = sc.nextLine();
                    boolean xoaThanhCong = ds.xoa(maPhongXoa);
                    if (xoaThanhCong) 
                        System.out.println("Xóa phòng học thành công.");
                    else 
                        System.out.println("Không tìm thấy phòng học có mã " + maPhongXoa);
                    break;
                    
                case 10:
                    // Tổng số phòng học
                    int tongPhongHoc = ds.tongPhongHoc();
                    System.out.println("Tổng số phòng học: " + tongPhongHoc);
                    break;
                    
                case 11:
                    // Lấy danh sách các phòng máy có ít nhất 60 máy tính
                    ArrayList<PhongMayTinh> phongMay60MayList = ds.layDanhSachPhongMay60May();
                    if (phongMay60MayList.isEmpty()) 
                        System.out.println("Không có phòng máy nào có 60 máy tính.");
                    else {
                        System.out.println("Danh sách các phòng máy có  60 máy tính:");
                        for (PhongMayTinh phongMayTinh : phongMay60MayList)
                            System.out.println(phongMayTinh.toString());
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }

        } while (choice != 0);
    }
}
