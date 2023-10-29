package Module3.giaodich;

public class Test {
	public static void main(String[] args) {
		GiaoDich list[] = new GiaoDich[6];
		list[0] = new GiaoDichVang("V111","10/12/2022",500000,10,"18k");
		list[1] = new GiaoDichVang("V112","2/9/2022",1300000,3,"18k");
		list[2] = new GiaoDichVang("v113","25/7/2023",250000,10,"18k");
		list[3] = new GiaoDichTienTe("TT111","11/12/2022",23000,100,23000,LoaiTienTe.USD);
		list[4] = new GiaoDichTienTe("TT112","13/5/2023",0.85,2000,0.85,LoaiTienTe.Euro);
		list[5] = new GiaoDichTienTe("TT113","1/6/2023",25000,150,25000,LoaiTienTe.VN);
		for(GiaoDich x : list) {
			System.out.println(x);
		}
		
		//Số lượng giao dịch vàng
		int slv = 0;
		for(GiaoDich x : list) {
			if(x instanceof GiaoDichVang) {
				slv += x.getSoLuong();
			}
		}
		System.out.println("\nSố lượng giao dịch vàng: "+slv);
		
		//Số lượng giao dịch tiền tệ
		int sltt = 0;
		for(GiaoDich x : list) {
			if(x instanceof GiaoDichTienTe) {
				sltt += x.getSoLuong();
			}
		}
		System.out.println("Số lượng giao dịch tiền tệ: "+sltt);
		
		//Tổng giao dịch
		System.out.println("Tổng số lượng giao dịch: "+(slv+sltt));

		//Trung bình thành tiền của giao dịch tiền tệ
		double tbThanhTien = 0;
		int cnt = 0;
		for(GiaoDich x : list) {
			if(x instanceof GiaoDichTienTe) {
				tbThanhTien += x.thanhTien();
				++cnt;
			}
		}
		System.out.println("\nTrung bình thành tiền của giao dịch tiền tệ: "+(tbThanhTien / cnt));
		
		// Xuất ra các giao dịch có đơn giá > 1 tỷ
		for(GiaoDich x : list) {
			if(x.getDonGia() > 1000000000)
				System.out.println(x);
		}
	}
}
