package tuan1.sinhvien;

public class SinhVien {
	private int mssv;
	private String hoTen;
	private float diemLT, diemTH;
	
	public SinhVien() {}
	public SinhVien(int mssv, String hoTen, float diemLT, float diemTH) throws Exception {
		setMssv(mssv);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		if(mssv > 0)
			this.mssv = mssv;
		else 
			this.mssv = 0;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) throws Exception {
		if(!hoTen.trim().equals(""))
			this.hoTen = hoTen;
		else
			throw new Exception("Error: họ tên rỗng!");
			
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		if(diemLT >= 0 && diemLT <= 10)
			this.diemLT = diemLT;
		else
			this.diemLT = 0;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		if(diemTH >= 0 && diemTH <= 10)
			this.diemTH = diemTH;
		else
			this.diemTH = 0;
	}
	
	public double diemTB() {
		return (diemLT + diemTH) / 2;
	}
	
	public static String tieuDe() {
		return String.format("%-8s  %-30s %8s %8s %8s","mssv", "hoten","diemLT","diemTH","diemTB");
	}
	
	@Override
	public String toString() {
		return String.format("%-8d  %-30s %8.2f %8.2f %8.2f",mssv,hoTen,diemLT,diemTH,diemTB() );
	}
	
	
}
