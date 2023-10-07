package Module3.sach;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestSach {
	public static void main(String[] args) {
		Sach list[] = new Sach[5];
		list[0] = new SachGiaoKhoa("1", new GregorianCalendar(2023,1,1), 10000, 10, "TRE", true);
		list[1] = new SachGiaoKhoa("2", new GregorianCalendar(2023,2,2), 15000, 20, "TRE", false);
		list[2] = new SachGiaoKhoa("3", new GregorianCalendar(2023,3,3), 10000, 5, "DINH TY", true);
		list[3] = new SachThamKhao("4", new GregorianCalendar(2023,4,4), 35000, 10, "KIM DONG", 200);
		list[4] = new SachThamKhao("5", new GregorianCalendar(2023,5,5), 20000, 10, "KIM DONG", 500);
		
		//Xuất thông tin toàn bộ sách
		for(Sach x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------------------------------------------------------");
		//Tính tổng thành tiền cho từng loại
		double thanhTienSachGK = 0;
		for(Sach x : list) {
			if(x instanceof SachGiaoKhoa) 
				thanhTienSachGK += ((SachGiaoKhoa) x).tinhThanhTien();
		}
		System.out.println("Thành tiền SGK: "+thanhTienSachGK+"\n");
		
		double thanhTienSachTK = 0;
		for(Sach x : list) {
			if(x instanceof SachThamKhao)
				thanhTienSachTK += ((SachThamKhao) x).tinhThanhTien();
		}
		System.out.println("Thành tiền STK: "+thanhTienSachTK);
		System.out.println("------------------------------------------------------------------------------------");
		//Tính trung bình cộng đơn giá sách tham khảo;
		double tbc = 0;
		int cnt = 0;
		for(Sach x : list) {
			if(x instanceof SachThamKhao) {
				tbc += x.getDonGia();
				cnt++;
			}	
		}
		System.out.println("TBC đơn gia sách tham khảo: "+(tbc/cnt));
		System.out.println("------------------------------------------------------------------------------------");
		//Xuất sách giáo khoa của nhà xuất bản (yêu cầu nhập)
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên nhà xuất bản: ");
		String s = sc.nextLine();
		for(Sach x : list) {
			if(x instanceof SachGiaoKhoa) {
				if(x.getNhaXuatBan().equalsIgnoreCase(s))
					System.out.println(x);
			}
		}
		
	}
}
