package module4.quanlyphonghoc;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong, dayNha;
	protected double dienTich;
	protected int soBongDen;
	
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayPhong) {
		this.dayNha = dayPhong;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		if(dienTich > 0)
			this.dienTich =	 dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		if(soBongDen > 0)
			this.soBongDen = soBongDen;
	}
	
	public boolean  coDuAnhSang() {
		return dienTich/10 <= soBongDen;
	}
	
	public abstract boolean datChuan();
	
	@Override
	public String toString() {
		String s = coDuAnhSang()?"Đủ ánh sáng":"Không đủ ánh sáng";
		return String.format("%10s %5s %10s %5s	 %-15s",maPhong, dayNha, dienTich, soBongDen, s);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dayNha, dienTich, maPhong, soBongDen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(dayNha, other.dayNha)
				&& Double.doubleToLongBits(dienTich) == Double.doubleToLongBits(other.dienTich)
				&& Objects.equals(maPhong, other.maPhong) && soBongDen == other.soBongDen;
	}
	
	
}
