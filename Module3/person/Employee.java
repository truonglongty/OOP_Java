package Module3.person;

public class Employee extends Person {
	private double heSoLuong;

	public Employee() {
		super();
	}
	public Employee(String hoTen, String diaChi, double heSoLuong) {
		super(hoTen, diaChi);
		this.heSoLuong = heSoLuong;
	}
	
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public double tinhLuong() {
		return 3000000 * heSoLuong;
	}
	
	public String danhGia() {
		if(heSoLuong >= 2.0)
			return "Lương cao";
		else if(heSoLuong >= 1.5)
			return "Lương vừa";
		else
			return "Lương thấp";
	}
	
	public static String getTieuDe() {
		return String.format("%s	%12s %8s %11s",Person.getTieuDe(),"Hệ_số_lương","Lương","Đánh_giá");
	}
	
	@Override
	public String toString() {
		return String.format("%s	%12.2f %8.2f %11s",super.toString(),heSoLuong,tinhLuong(),danhGia());
	}
	
}
