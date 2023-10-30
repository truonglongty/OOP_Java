package Module3.hanghoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat, ngayHetHan;
	
	public HangThucPham() {
		super();
	}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuong, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuong);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
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
	
	private boolean hetHan() {
		if(ngaySanXuat.isBefore(LocalDate.now()))
			return true;
		return false;
	}
	
	@Override
	public String danhGia() {
		return (soLuong > 0 && hetHan())?"Khó bán":"Không đánh giá";
	}

	@Override
	public double vAT() {
		return 0.05 * donGia;
	}
	
	public static String getTieuDe() {
		return String.format("%s	%-16s %-20s %-20s",HangHoa.getTieuDe(),"Nhà_cung_cấp","Ngày_sản_xuất","Ngày_hết_hạn");
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s	%-16s %-20s %-20s",super.toString(),nhaCungCap,dtf.format(ngaySanXuat),dtf.format(ngayHetHan));
		
	}

}
