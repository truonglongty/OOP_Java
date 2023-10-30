package Module3.hanghoa;

import java.text.DecimalFormat;

public abstract class HangHoa {
	private String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuong;
	
	public HangHoa() {}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuong) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception {
		if(!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Mã hàng không được phép rỗng");
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia){
		if(donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong){
		if(soLuong > 0)
			this.soLuong = soLuong;
		else
			this.soLuong = 0;
	}
	
	public abstract String danhGia();
	
	public abstract double vAT();
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%10s %20s %15s %15s", maHang, tenHang, donGia, soLuong);
	}
	
	public static String getTieuDe() {
		return String.format("%10s %20s %15s %15s", "Mã_hàng", "Tên_hàng", "Đơn_giá", "Số_lượng_tồn");
	}
}
