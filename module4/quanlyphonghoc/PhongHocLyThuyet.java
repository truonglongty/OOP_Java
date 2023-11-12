package module4.quanlyphonghoc;

public class PhongHocLyThuyet extends PhongHoc{
	private boolean coMayChieu;

	public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	@Override
	public boolean datChuan() {
		return super.coDuAnhSang() && coMayChieu;
	}
	
	@Override
	public String toString() {
		String mayChieu = (coMayChieu)?"Có máy chiếu":"Không có máy chiếu";
		String chuan = (datChuan())?"x":"";
		return super.toString()+String.format("  %-20s %3s",mayChieu, chuan);
	}
	
}
