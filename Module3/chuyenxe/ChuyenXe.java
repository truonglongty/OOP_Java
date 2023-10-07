
package chuyenxe;

public class ChuyenXe {
	private String maSoChuyen;
	private String hoTenTX;
	private String soXe;
	private double doanhThu;
	
	public ChuyenXe() {
		super();
		this.maSoChuyen = "";
		this.hoTenTX = "";
		this.soXe = "";
		this.doanhThu = 0;
	}
	
	public ChuyenXe(String maSoChuyen, String hoTenTX, String soXe, double doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoTenTX = hoTenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	

	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getHoTenTX() {
		return hoTenTX;
	}

	public void setHoTenTX(String hoTenTX) {
		this.hoTenTX = hoTenTX;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}	
	
	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	@Override
	public String toString() {
		return "Mã số chuyến: "+maSoChuyen
				+", Họ tên tài xế: "+hoTenTX
				+", Số xe: "+soXe
				+", Doanh thu: "+doanhThu;	
	}
	
}
