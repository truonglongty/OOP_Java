package Module3.person;

public class Person {
	protected String hoTen, diaChi;

	public Person() {}
	public Person(String hoTen, String diaChi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	@Override
	public String toString() {
		return String.format("%30s %50s",hoTen,diaChi);
	}
	
	public static String getTieuDe() {
		return String.format("%30s %50s","Ho_ten","Dia_chi");
	}
	
	
}
