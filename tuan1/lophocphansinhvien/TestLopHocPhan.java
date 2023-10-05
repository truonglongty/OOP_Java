package tuan1.lophocphansinhvien;

public class TestLopHocPhan {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("226","Trương Long Tý");
		SinhVien sv2 = new SinhVien("123","Nguyễn Văn A");
		SinhVien sv3 = new SinhVien("543","Lê Thị B");
		
		SinhVien[] dsSV = {sv1, sv2, sv3};
		LopHocPhan l1 = new LopHocPhan("123456","LT Hướng đối tượng","Thầy Phước","Thứ 7, tiết 7-9, phòng X.10.6",dsSV);
		System.out.println(l1);
		System.out.println("Danh sách sinh viên");
		for(SinhVien sv : dsSV) {
			System.out.println("   "+sv);
		}
		System.out.println("Tổng số sinh viên: "+dsSV.length);
	}
}
