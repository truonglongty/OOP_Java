package tuan1.sinhvien;

import java.util.Scanner;

public class TestSinhVien {
	public static void main(String[] args) throws Exception {
		SinhVien sv1 = new SinhVien(22656001,"Trương Long Tý",8.5f,9f);
		SinhVien sv2 = new SinhVien(11111111,"Nguyễn Văn A",9.5f,10f);
		Scanner sc = new Scanner(System.in);
		SinhVien sv3 = new SinhVien();
		System.out.println("Nhập mã số của sv3: ");
		int mssv = sc.nextInt();
		sc.nextLine(); //đọc dấu enter bị thừa
		System.out.println("Nhập họ và tên của sv3: ");
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sv3: ");
		float diemLT = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sv3: ");
		float diemTH = sc.nextFloat();
		sv3.setMssv(mssv);
		sv3.setHoTen(hoten);
		sv3.setDiemLT(diemLT);
		sv3.setDiemTH(diemTH);
		System.out.println(SinhVien.tieuDe());
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
