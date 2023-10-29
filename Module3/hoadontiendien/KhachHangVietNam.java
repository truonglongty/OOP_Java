package Module3.hoadontiendien;

import java.util.Calendar;

public class KhachHangVietNam extends KhachHang{
	private LoaiKhachHang loaiKhachHang;
	private double dinhMuc;
	
	public KhachHangVietNam() {
		super();
	}
	public KhachHangVietNam(String maKH, String hoTen, Calendar ngayLapHD, double soKW, double donGia,
			LoaiKhachHang loaiKhachHang, double dinhMuc) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		this.loaiKhachHang = loaiKhachHang;
		this.dinhMuc = dinhMuc;
	}

	public LoaiKhachHang getLoaiKhachHang() {
		return loaiKhachHang;
	}
	public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	@Override
	public double thanhTien() {
		if(soKW <= dinhMuc)
			return soKW * donGia;
		else 
			return soKW*donGia*dinhMuc + (soKW-dinhMuc)*donGia*2.5;
	}
	
	@Override
	public String toString() {
		return "KHÁCH HÀNG VIỆT NAM -- "+super.toString()+" ,Loại khách hàng: "+loaiKhachHang+
				" ,Định mức: "+dinhMuc;
	}

}
