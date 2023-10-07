package Module3.chuyenxe;

public class TestChuyenXe {
	public static void main(String[] args) {
		ChuyenXe nt = new ChuyenXeNoiThanh("1111", "Nguyễn Văn A", "67A-1234", 200000, 30, 250);
		System.out.println(nt);
		ChuyenXe ngt = new ChuyenXeNgoaiThanh("1112", "Trần Thị B", "55B-4321", 180000, "TP.HCM", 2);
		System.out.println(ngt);
		System.out.println("-----------------------------------------------------------------------------------");
		ChuyenXe arr[] = new ChuyenXe[5];
		arr[0] = new ChuyenXeNoiThanh("NT001", "Nguyễn Văn A", "51N-1234", 110000, 5, 50);
		arr[1] = new ChuyenXeNoiThanh("NT002", "Nguyễn Văn B", "51N-1412", 70000, 3, 15);
		arr[2] = new ChuyenXeNoiThanh("NT003", "Nguyễn Văn C", "51N-1243", 90000, 2, 20);
		arr[3] = new ChuyenXeNgoaiThanh("NT004", "Nguyễn Văn D", "67N-4321", 100000, "Quận 1", 200);
		arr[4] = new ChuyenXeNgoaiThanh("NT005", "Nguyễn Văn E", "67N-1234", 100000, "Quận Gò Vấp", 50);
		for(ChuyenXe x : arr) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------------------------------------------");
		double doanhThuNT = 0;
		for(ChuyenXe x : arr) {
			if(x instanceof ChuyenXeNoiThanh)
				doanhThuNT += x.getDoanhThu();
		}
		System.out.println("Doanh thu chuyến xe nội thành: "+doanhThuNT+"\n");
		double doanhThuNgT = 0;
		for(ChuyenXe x : arr) {
			if(x instanceof ChuyenXeNgoaiThanh)
				doanhThuNgT += x.getDoanhThu();
		}
		System.out.println("Doanh thu chuyến xe ngoại thành: "+doanhThuNgT);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Tổng doanh thu: "+(doanhThuNT + doanhThuNgT));
	}
}