package Module3.giaodich;

import java.time.LocalDate;

public class GiaoDich {
	protected String maGD, ngayGD;
	protected double donGia;
	protected int soLuong;
	
	public GiaoDich() {
		super();
	}

	public GiaoDich(String maGD, String ngayGD, double donGia, int soLuong) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
		
	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public String getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
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

	public double thanhTien() {
		return 0;
	};
	
	@Override
	public String toString() {
		return "Mã giao dich: "+maGD
				+",Ngày giao dịch: "+ngayGD
				+",Đơn giá: "+donGia
				+",Số lượng: "+soLuong;
	}
	
}
