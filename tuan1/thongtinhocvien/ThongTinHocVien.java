package tuan1.thongtinhocvien;

public class ThongTinHocVien {
	private String hoTen, diaChi, soDT;

	public ThongTinHocVien(String hoTen, String diaChi, String soDT) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDT = soDT;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	
	@Override
	public String toString() {
		return "Học tên: "+hoTen+", Địa chỉ: "+diaChi+", Số điện thoại: "+soDT;
	}
}
