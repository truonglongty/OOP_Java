package tuan1.sotietkiem;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;
	
	
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		this.maSo = maSo;
		this.ngayMoSo = ngayMoSo;
		this.soTienGoi = soTienGoi;
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}

	public int tinhSoThangGoiThuc() {
		LocalDate ngayHienTai = LocalDate.now();
		int soThangGoiThuc = (int) ngayMoSo.until(ngayHienTai).toTotalMonths();
		return soThangGoiThuc;
	}
	
	public double tinhTienLai() {
		return (soTienGoi * laiSuat * tinhSoThangGoiThuc()) / 12;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public float getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}
		
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return maSo+"-ngày mở "+dtf.format(ngayMoSo)+" kỳ hạn "+kyHan+" tháng, lãi suất "+
				laiSuat+" - "+"Số tháng gởi: "+tinhSoThangGoiThuc()+
				String.format("; Tiền lãi: %s",df.format(tinhTienLai()));
	}
}
