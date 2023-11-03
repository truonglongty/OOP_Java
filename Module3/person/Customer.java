package Module3.person;

import java.text.DecimalFormat;

public class Customer extends Person{
	private String tenCongTy;
	private double triGiaHD;
	
	public Customer() {
		super();
	}
	public Customer(String hoTen, String diaChi, String tenCongTy, double triGiaHD) {
		super(hoTen, diaChi);
		this.tenCongTy = tenCongTy;
		this.triGiaHD = triGiaHD;
	}
	
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public double getTriGiaHD() {
		return triGiaHD;
	}
	public void setTriGiaHD(double triGiaHD) {
		this.triGiaHD = triGiaHD;
	}
	
	public String danhGia() {
		if(triGiaHD > 1000)
			return "VIP";
		else if(triGiaHD > 500)
			return "Tiềm năng";
		else
			return "Mới";
	}
	
	public static String getTieuDe() {
		return String.format("%s	%30s %8s %11s",Person.getTieuDe(),"CompanyName","GiaHD","Đánh_giá");
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%s	%30s %8s %11s",super.toString(),tenCongTy,df.format(triGiaHD),danhGia());
	}

}
