package tuan1.hangthucpham;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang, tenHang;
	private double donGia;
	private LocalDate ngaySanXuat, ngayHetHan;
	
	public HangThucPham() {}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
		
	}
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception {
		if(!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Error! Mã hàng không được phép rỗng");
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
	public void setDonGia(double donGia) {
		if(donGia >= 0)
			this.donGia = donGia;
		else
			this.donGia = 0.0;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;
	}
	
	public boolean hetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
	}
	
	public static String tieuDe() {
		return String.format("%-10s %-10s %15s   %-15s %-15s %-20s","Mã_hàng","Tên_hàng","Đơn_giá",
				"Ngày_sản_xuất","Ngày_hết_hạn","Ghi_chú");
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-10s %15s   %-15s %-15s %-20s",maHang,tenHang,df.format(donGia)+"VND",
				dtf.format(ngaySanXuat),dtf.format(ngayHetHan),hetHan()==true?"Hàng hết hạn":"Còn hạn");
	}
}
