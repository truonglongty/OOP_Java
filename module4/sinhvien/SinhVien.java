package module4.sinhvien;

public class SinhVien implements Comparable<SinhVien>{
	private String mssv, hoTen;
	private int nam;
	
	public SinhVien(String mssv, String hoTen, int nam) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.nam = nam;
	}
	
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoTen=" + hoTen + ", namSinh=" + nam + "]";
	}

	@Override
	public int compareTo(SinhVien sv) {
		return mssv.compareToIgnoreCase(sv.mssv);
	}
	
	
}
