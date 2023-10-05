package tuan1.tamgiac;

public class TamGiac {
	private double ma, mb, mc;
	
	public TamGiac() {}

    public TamGiac(double ma, double mb, double mc) {
        if (ma <= 0 || mb <= 0 || mc <= 0 || !isTamGiac(ma, mb, mc)) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        } 
        else {
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }
    }

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		if(ma > 0 && isTamGiac(ma,this.mb,this.mc))
			this.ma = ma;
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) {
		if(mb > 0 && isTamGiac(this.ma,mb,this.mc))
			this.mb = mb;
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc) {
		if(mc > 0 && isTamGiac(this.ma,this.mb,mc))
			this.mc = mc;
	}
	
	public boolean isTamGiac(double ma, double mb, double mc) {
		return (ma+mb>mc) && (ma+mc>mb) && (mb+mc>ma);
	}
	
	public double chuVi() {
		return ma + ma + mc;
	}
	
	public double dienTich() {
		double  p = chuVi()/2;
		return Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
	}
	
	public String kieuTamGiac() {
		if(!isTamGiac(ma,mb,mc))
			return "Không phải tam giác";
		else if(ma==mb && ma==mc) {
			return "Đều";
		}
		else if(ma == mb || ma == mc || mb == mc) {
			return "Cân";
		}
		else {
			return "Thường";
		}
	}

	
	public static String tieuDe() {
		return String.format("%18s %20s    %8s   %8s","Thông_tin_3_canh", "Kiểu_tam_giác","Chu_vi","Dien_tich");
	}
	
	 @Override
	 public String toString() {
		 return String.format("%6.2f,%6.2f,%6.2f %20s  %8.2f  %8.2f",
	                ma, mb, mc, kieuTamGiac(), chuVi(), dienTich());
	 }
}
