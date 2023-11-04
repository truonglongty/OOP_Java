package Module3.sinhvien;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
        SinhVien sinhVienTrungCap = new SinhVienTrungCap("SVTC123", "Nguyen Van B", "Hai Phong", "987654321");
        System.out.println("\nSinh Vien Trung Cap:");
        System.out.println(sinhVienTrungCap);

        SinhVien sinhVienCaoDang = new SinhVienCaoDang("SVCD456", "Tran Thi C", "Da Nang", "123456789", "CNTT");
        System.out.println("\nSinh Vien Cao Dang:");
        System.out.println(sinhVienCaoDang);

        SinhVien sinhVienDaiHoc = new SinhVienDaiHoc("SVDH789", "Le Van D", "Quang Ninh", "123123123", "Kinh Te");
        System.out.println("\nSinh Vien Dai Hoc:");
        System.out.println(sinhVienDaiHoc);

        SinhVien sinhVienLienKet = new SinhVienLienKet("SVLK101", "Do Thi E", "TP.HCM", "456789123", "Australia");
        System.out.println("\nSinh Vien Lien Ket:");
        System.out.println(sinhVienLienKet);
        Scanner sc = new Scanner(System.in);
	 }
	 
	 public static void Nhap(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Nhập mssv: ");
		 String mssv = sc.nextLine();
		 System.out.print("Nhập ho và tên: ");
		 String hoTen = sc.nextLine();
		 System.out.print("Nhập địa chỉ: ");
		 String diaChi = sc.nextLine();
		 System.out.print("Nhập sđt: ");
		 String sdt = sc.nextLine();
	 }
}
