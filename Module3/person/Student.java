package Module3.person;

public class Student extends Person {
	private double diem1, diem2;
	
	public Student() {
		super();
	}
	public Student(String hoTen, String diaChi, double diem1, double diem2) {
		super(hoTen, diaChi);
		this.diem1 = diem1;
		this.diem2 = diem2;
	}
	
	public double getDiem1() {
		return diem1;
	}
	public void setDiem1(double diem1) {
		this.diem1 = diem1;
	}
	public double getDiem2() {
		return diem2;
	}
	public void setDiem2(double diem2) {
		this.diem2 = diem2;
	}
	
	public double tinhDTB() {
		return (diem1 + diem2) / 2;
	}
	
	public String danhGia() {
		if(tinhDTB() >= 8)
			return "Giỏi";
		else if(tinhDTB() >= 6.5)
			return "Khá";
		else if(tinhDTB() >= 5)
			return "TB";
		else
			return "Yếu";
	}
	
	public static String getTieuDe() {
		return String.format("%s	%6s %6s %6s %8s",Person.getTieuDe(),"Diem1","Diem2","DTB","Đánh_giá");
	}
	
	@Override
	public String toString() {
		return String.format("%s	%6.2f %6.2f %6.2f %8s",super.toString(),diem1,diem2,tinhDTB(),danhGia());
	}

}
