package Module3.hanghoa;

public class HangDienMay extends HangHoa {
	private double baoHanh;
	private double congSuat;
	
	
	public HangDienMay() {
		super();
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuong, double baoHanh, double congSuat)
			throws Exception {
		super(maHang, tenHang, donGia, soLuong);
		this.baoHanh = baoHanh;
		this.congSuat = congSuat;
	}
	
	public double getBaoHanh() {
		return baoHanh;
	}
	public void setBaoHanh(double baoHanh) {
		if(baoHanh > 0)
			this.baoHanh = baoHanh;
		else
			this.baoHanh = 0;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		if(congSuat > 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}
	
	@Override
	public String danhGia() {
		return (soLuong < 3) ? "Bán được" : "Không đáng giá";
	}

	@Override
	public double vAT() {
		return 0.1 * donGia;
	}
	
	public static String getTieuDe() {
		return String.format("%s	%-16s %-20s",HangHoa.getTieuDe(),"Bảo_hành","Công_suất");
	}
	
	@Override
	public String toString() {
		String bh = baoHanh + " tháng";
		String cs = congSuat + "KW";
		return String.format("%s	%-16s %-20s",super.toString(),bh,cs);
	}

}
