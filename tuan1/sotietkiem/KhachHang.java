package tuan1.sotietkiem;

import java.time.LocalDate;

public class KhachHang {
	private String maKH, hoTenKh;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSo;
	
	public KhachHang(String maKH, String hoTenKh, int soLuongSo) {
		this.maKH = maKH;
		this.hoTenKh = hoTenKh;
		this.soLuongSo = soLuongSo;
		this.dsSoTietKiem = new SoTietKiem[soLuongSo];
	}
	
	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		if(soLuongSo < dsSoTietKiem.length) {
			SoTietKiem stk = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
			dsSoTietKiem[soLuongSo] = stk;
			soLuongSo++;
			return true;
		}
		return false;
	}

	public String getMaKH() {
		return maKH;
	}


	public String getHoTenKh() {
		return hoTenKh;
	}

	public void setHoTenKh(String hoTenKh) {
		this.hoTenKh = hoTenKh;
	}

	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}


	public int getSoLuongSo() {
		return soLuongSo;
	}

	@Override
	public String toString() {
		return "Khách hàng: "+maKH+" - "+hoTenKh;
	}
	
	
}
