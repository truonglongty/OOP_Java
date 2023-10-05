package tuan1.cd;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if(maCD > 0)
			this.maCD = maCD;
		else
			this.maCD = 999999;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if(!tuaCD.trim().equalsIgnoreCase(""))
			this.tuaCD = tuaCD;
		else
			this.tuaCD = "Chưa xác định";
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat > 0)
			this.soBaiHat = soBaiHat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		if(giaThanh > 0)
			this.giaThanh = giaThanh;
	}
	
	public static String tieuDe() {
		return String.format("%-8s %-15s %10s %15s","Mã_CD","Tựa_CD","Số bài hát","Giá thành");
	}
	
	@Override
	public String toString() {
		return String.format("%-8d %-15s %10d %15.2f",maCD,tuaCD,soBaiHat,giaThanh);
	}
}
