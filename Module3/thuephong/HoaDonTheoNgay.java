package Module3.thuephong;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private int soNgayThue;
	
	public HoaDonTheoNgay() {
		super();
	}
	public HoaDonTheoNgay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, int soNgayThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}
	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}
	
	@Override
	public double thanhTien() {
		if(soNgayThue > 7)
			return soNgayThue * donGia * 0.8;
		else 
			return soNgayThue * donGia;
	}

	@Override
	public String toString() {
		return "HÓA ĐƠN THEO NGÀY -- "+super.toString()+" ,Số ngày thuê: "+soNgayThue+" , Thành tiền: "+thanhTien();
	}
}
