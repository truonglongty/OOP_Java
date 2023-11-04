package Module3.sinhvien;

import java.util.Scanner;

public class SinhVien {
	protected String mssv, hoTen, diaChi, sdt;
	
	public SinhVien() {}
	public SinhVien(String mssv, String hoTen, String diaChi, String sdt) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	
	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + "]";
	}
	
	
	
}
