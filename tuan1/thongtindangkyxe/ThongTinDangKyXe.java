package tuan1.thongtindangkyxe;

public class ThongTinDangKyXe {
	private String tenChuXe, loaiXe;
	private double triGia;
	private int dungTich;
	
	
	public ThongTinDangKyXe() {}
	public ThongTinDangKyXe(String tenChuXe, String loaiXe, int dungTich, double triGia) throws Exception{
		setTenChuXe(tenChuXe);
		setLoaiXe(loaiXe);
		setTriGia(triGia);
		setDungTich(dungTich);
	
	}
	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) throws Exception {
		if(tenChuXe != "")
			this.tenChuXe = tenChuXe;
		else
			throw new Exception("Error! Ten chủ xe không dược phép rỗng");
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) throws Exception {
		if(loaiXe != "")
			this.loaiXe = loaiXe;
		else
			throw new Exception("Error! Loại xe không được phép rỗng");
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		if(triGia >= 0)
			this.triGia = triGia;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		if(dungTich >= 0)
			this.dungTich = dungTich;
	}
	
	public double thue() {
		if(dungTich < 100)
			return triGia*0.01;
		else if(dungTich >= 100 && dungTich <= 200)
			return triGia*0.03;
		else
			return triGia*0.05;
	}
	
	public static String tieuDe() {
		return String.format("%-30s %-30s %15s %20s %20s","Tên_chủ_xe","Loại_xe", "Dung_tích","Trị_giá","Thuế_phải_nộp");
	}
	
	@Override
	public String toString() {
		return String.format("%-30s %-30s %15d %20.2f %20.2f",tenChuXe,loaiXe,dungTich,triGia,thue());
	}
}

