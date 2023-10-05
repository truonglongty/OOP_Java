package tuan1.lophocphansinhvien;

public class LopHocPhan {
	private String maLHP, tenLHP, tenGV, thongTinLopHoc;
	private SinhVien[] dsSV;
	
	public LopHocPhan() {}
	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		this.maLHP = maLHP;
		this.tenLHP = tenLHP;
		this.tenGV = tenGV;
		this.thongTinLopHoc = thongTinLopHoc;
		this.dsSV = dsSV;
	}
	public String getMaLHP() {
		return maLHP;
	}
	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}
	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc = thongTinLopHoc;
	}
	public SinhVien[] getDsSV() {
		return dsSV;
	}
	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}
	
	public int getSoLuongSV() {
		return dsSV.length;
	}
	
	@Override
	public String toString() {
		return "- Mã LHP: "+maLHP+"\n"
				+"- Tên LHP: "+tenLHP+"\n"
				+"- GV giảng day: "+tenGV+"\n"
				+"- Thông tin buổi học: "+thongTinLopHoc+"\n";
	}
	
}
