package Module3.hanghoa;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public HangSanhSu() {
		super();
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuong, String nhaSanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuong);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = LocalDate.now();
	}
	
	@Override
	public String danhGia() {
		Period intervalPeriod = Period.between(ngayNhapKho, LocalDate.now());
		int soNgay = intervalPeriod.getDays();
		return (soLuong > 50 && soNgay > 10)?"Bán chậm":"Không đánh giá";
	}
	
	@Override
	public double vAT() {
		return 0.1 * donGia;
	}
	
	public static String getTieuDe() {
		return String.format("%s	%-16s %20s",HangHoa.getTieuDe(),"Nhà_sản_xuất","Ngày_nhập_kho");
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s	%-16s 	%-20s",super.toString(),nhaSanXuat,dtf.format(ngayNhapKho));
	}
	
	
}	
