package tuan1.thongtinhocvien;

import java.time.LocalDate;
import java.util.List;

public class ThongTinKhoaHoc {
	private String tenKH;
	private LocalDate ngayMo;
	private String timeHoc;
	private ThongTinHocVien[] list;
	private int count = 0;
	
	public ThongTinKhoaHoc(String tenKH, LocalDate ngayMo, String timeHoc) {
		this.tenKH = tenKH;
		this.ngayMo = ngayMo;
		this.timeHoc = timeHoc;
		list = new ThongTinHocVien[20];
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public LocalDate getNgayMo() {
		return ngayMo;
	}
	public void setNgayMo(LocalDate ngayMo) {
		this.ngayMo = ngayMo;
	}
	public String getTimeHoc() {
		return timeHoc;
	}
	public void setTimeHoc(String timeHoc) {
		this.timeHoc = timeHoc;
	}
	public ThongTinHocVien[] getList() {
		return list;
	}
	public void setList(ThongTinHocVien[] list) {
		this.list = list;
	}
	
	public void addHocVien(ThongTinHocVien hv) {
		if(count < list.length) {
			list[count++] = hv;
			return;
		}
		System.out.println("Danh sách full!");
	}
	
	public static ThongTinKhoaHoc timKhoaHocTheoTen(List<ThongTinKhoaHoc> danhSachKhoaHoc, String tenKhoaHoc) {
	    for (ThongTinKhoaHoc khoaHoc : danhSachKhoaHoc) {
	        if (khoaHoc.getTenKH().equalsIgnoreCase(tenKhoaHoc)) {
	            return khoaHoc;
	        }
	    }
	    return null; // Trả về null nếu không tìm thấy
	}

	
	public boolean daHocKH(ThongTinHocVien hv) {
		for(int i=0; i<count; i++) {
			if(list[i].equals(hv))
				return true;
		}
		return false;
	}
	
	 public boolean khoaHocChuaKetThuc() {
	        LocalDate ngayHienTai = LocalDate.now();
	        return ngayHienTai.isBefore(ngayMo);
	    }
	
	public boolean khoaHocChuaBatDau() {
		LocalDate ngayHienTai = LocalDate.now();
		return ngayHienTai.isBefore(ngayMo);
	}
	
	public String getTieuDe() {
		return "Tên khóa học: "+tenKH+", Ngày mở: "+ngayMo+", Thời gian học: "+timeHoc;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<count; i++) {
			s += list[i].toString()+"\n";
		}
		return s;
	}
	
}
