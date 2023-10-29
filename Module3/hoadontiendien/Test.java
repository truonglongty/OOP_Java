package Module3.hoadontiendien;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<KhachHang> ls = new ArrayList<>();
		ls.add(new KhachHangVietNam("VN001", "Nguyễn Văn A",new GregorianCalendar(2023,2,16), 
				200, 4, LoaiKhachHang.SinhHoat, 150));
		ls.add(new KhachHangVietNam("VN002", "Trần Thị B", new GregorianCalendar(2023,2,10),
					500, 4.5, LoaiKhachHang.KinhDoanh, 400));
		ls.add(new KhachHangVietNam("VN003", "Lê Văn C", new GregorianCalendar(2018,9,10),
					1000, 5, LoaiKhachHang.SanXuat, 800));
		ls.add(new KhachHangNuocNgoai("FR001", "John Smith", new GregorianCalendar(2023,9,2), 300, 6, "USA"));
		ls.add(new KhachHangNuocNgoai("FR002", "Maria Garcia", new GregorianCalendar(2023,9,2), 700, 5, "Spain"));
		ls.add(new KhachHangNuocNgoai("FR003", "Liu Wei", new GregorianCalendar(2018,9,10), 1200, 5.2, "China"));
		
		for(KhachHang x : ls) {
			System.out.println(x);
		}
		
		//Tính tổng số lượng cho từng loại khách hàng
		int slVN=0, slNNg=0;
		for(KhachHang x : ls) {
			if(x instanceof KhachHangVietNam)
				slVN++;
			else if (x instanceof KhachHangNuocNgoai)
				slNNg++;
		}
		System.out.println("Số lượng khách VN: "+slVN);
		System.out.println("Số lượng khách nước ngoài: "+slNNg);
		
		//Tính trung bình thành tiền của khách hàng nước ngoài
		int s=0, cnt=0;
		for(KhachHang x : ls) {
			if(x instanceof KhachHangNuocNgoai) {
				s += x.thanhTien();
				cnt++;
			}
		}
		System.out.println("\nTrung bình thành tiền khách nước ngoài: "+(s/cnt));
		System.out.println("\nHoá đơn trong tháng 09 năm 2018:");
		for(KhachHang x : ls) {
			if(x.getNgayLapHD().get(Calendar.YEAR)==2018 && x.getNgayLapHD().get(Calendar.MONTH)==9)
				System.out.println(x);
		}
	}
}
