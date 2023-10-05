package tuan1.hinhtron;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public HinhTron() {}
	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}
	
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi() {
		return 2 * Math.PI * banKinh;
	}
	
	public double tinhDienTich() {
		return Math.PI * banKinh * banKinh;
	}
	
	@Override
	public String toString() {
		return "Diện tích và chu vi hình tròn tâm "+tam+" có bán kinh "
				+banKinh+" là " + String.format("%.2f và %.2f",tinhDienTich(),tinhChuVi());
	}
	
}
