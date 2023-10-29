package Module3.giaodichnhadat;

import java.time.LocalDate;

public class GiaoDich {
	protected String maGD, ngayGD;
	protected double donGia;
	protected double dienTich;
	
	public GiaoDich() {
		super();
	}

	public GiaoDich(String maGD, String ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
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

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public double thanhTien() {
		return 0;
	};
	
	@Override
	public String toString() {
		return "Mã giao dich: "+maGD
				+",Ngày giao dịch: "+ngayGD
				+",Đơn giá: "+donGia
				+",Diện tích: "+dienTich;
	}
	
}
