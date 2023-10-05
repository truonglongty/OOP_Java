package tuan1.hinhchunhat;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		if(d>0)
			this.chieuDai = d;
		else
			System.out.println("Error!");
		if(r>0)
			this.chieuRong = r;
		else
			System.out.println("Error!");
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double d) {
		if(d>0)
			this.chieuDai = d;
		else
			System.out.println("Error!");
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double r) {
		if(r>0)
			this.chieuRong = r;
		else
			System.out.println("Error!");
	}
	
	public double getChuVi() {
		return (getChieuDai() + getChieuRong()) * 2;
	}
	
	public double getDienTich() {
		return getChieuDai() * getChieuRong();
	}
	
	@Override
	public String toString() {
		String s = "";
		s += s.format("Chieu dai: %10s, Chieu rong: %10s, Chu vi: %10s, Dien tich: %10s",getChieuDai(),getChieuRong(),getChuVi(), getDienTich());
		return s;
	}
	
}

