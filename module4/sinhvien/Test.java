package module4.sinhvien;

import java.util.Collections;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		DanhSachSinhVien ds = new DanhSachSinhVien();
//		Collections.addAll(ds, new SinhVien("IT100","Nguyễn Văn A",2004),
//							   new SinhVien("IT101","Trần Thị B",2004),
//							   new SinhVien("IT102","Trương Văn D",2003));
		ds.them(new SinhVien("IT100","Nguyễn Văn A",2004));
		ds.them(new SinhVien("IT101","Trần Thị B",2004));
		ds.them(new SinhVien("IT104","Trương Văn D",2003));
		ds.them(new SinhVien("IT103","Trần Thu C",2004));
		ds.them(new SinhVien("IT102","Trương Văn A",2004));
		
		//Xuat
		ds.xuat();
		
		//Xoa
		System.out.println("\nNhập mã cần xóa: ");
		Scanner sc = new Scanner(System.in);
		String maXoa = sc.nextLine();
		if(ds.xoa(maXoa) == true)
			System.out.println("\nĐã xóa sinh viên có mã: "+maXoa+"\n");
		else
			System.out.println("\n"+maXoa+" không tồn tại trong danh sách\n");
		ds.xuat();
		
		//sửa
		System.out.println("\nNhập mã cần sửa: ");
		String maSua = sc.nextLine();
		if(ds.capNhat(maSua, "Trương Long Tý", 2004) == true)
			ds.xuat();
		else
			System.out.println("Not exists");
		
		//Tim theo mã
		System.out.println("\nNhập mã cần tim: ");
		String timMa = sc.nextLine();
		if(ds.timTheoMa(timMa) != null)
			System.out.println(ds.timTheoMa(timMa));
		else
			System.out.println("Not exists");
		
		//Tim theo ten
		System.out.println("\nNhập tên cần tìm: ");
		String ten = sc.nextLine();
		if(ds.timTheoTen(ten) != null)
			System.out.println(ds.timTheoTen(ten)+"\n");
		else
			System.out.println("Not exists");
		
		//Sap xep theo ma tang dan
		System.out.println("Sắp mã tăng dần");
		ds.sapMaTang();
		ds.xuat();
	}
}
