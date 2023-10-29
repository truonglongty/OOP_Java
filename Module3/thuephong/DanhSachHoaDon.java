package Module3.thuephong;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHoaDon {
	private List<HoaDon> danhSach;
	
	public DanhSachHoaDon() {
		danhSach = new ArrayList<HoaDon>();
	}
	
	public boolean them(HoaDon hd) {
		if(danhSach.contains(hd))
			return false;
		else
			return danhSach.add(hd);
	}
	
	public int thongKeSoLuongHDTheoGio() {
		int cnt = 0;
		for(HoaDon ls : danhSach) {
			if(ls instanceof HoaDonTheoGio)
				++cnt;
		}
		return cnt;
	}
	
	public int thongKeSoLuongHDTheoNgay() {
		int cnt = 0;
		for(HoaDon ls : danhSach) {
			if(ls instanceof HoaDonTheoNgay)
				++cnt;
		}
		return cnt;
	}
	
	public double tinhTongThanhTien(int thang, int nam) {
		double s = 0;
		for(HoaDon ls : danhSach) {
			if(ls.getNgayHD().getMonthValue()==thang && ls.getNgayHD().getYear()==nam)
				s += ls.thanhTien();
		}
		return s;
	}

	@Override
	public String toString() {
		String s = "";
		for(HoaDon ls : danhSach) {
			s += ls.toString() + "\n";
		}
		return s;
	}
	
	
}
