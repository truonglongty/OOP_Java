package module4.quanlyphonghoc;

public class PhongMayTinh extends PhongHoc{
	private int soMayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}
	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean datChuan() {
		return super.coDuAnhSang() && (dienTich / soMayTinh >= 1.5);
  	}
	
	@Override
	public String toString() {
		String s = (datChuan())?"x":"";
		return super.toString()+String.format("  %-20d %3s",soMayTinh, s);
	}
}
