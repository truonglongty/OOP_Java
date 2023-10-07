package Module3.sach;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sach {
	private String maSach;
	private Calendar ngayNhap;
	protected double donGia;
	protected int soLuong;
	private String nhaXuatBan;
	
	public Sach() {
		super();
		this.maSach = "";
		//this.ngayNhap = new GregorianCalendar(0,0,0);
		this.donGia = 0;
		this.soLuong = 0;
		this.nhaXuatBan = "";
	}
	
	public Sach(String maSach, Calendar ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public Calendar getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Calendar ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	@Override
	public String toString() {
		String ngayNhapString = ngayNhap.get(Calendar.DAY_OF_MONTH)+ "/" 
				+ ngayNhap.get(Calendar.MONTH) + "/" + ngayNhap.get(Calendar.YEAR);
		return "Mã sách: "+maSach
				+", Ngày nhập: "+ngayNhapString
				+", Đơn giá: "+donGia
				+", Số lượng: "+soLuong
				+", Nhà xuất bản: "+nhaXuatBan;
	}
	
	
}

