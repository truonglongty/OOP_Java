package tuan1.lophocphansinhvien;

public class SinhVien {
	private String maSV, hoTen;

	public SinhVien(String maSV, String hoTen) {
		this.maSV = maSV;
		this.hoTen = hoTen;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	@Override
	public String toString() {
		return maSV+" | "+hoTen;
	}
	
	
}
