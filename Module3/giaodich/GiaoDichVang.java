package Module3.giaodich;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	public GiaoDichVang() {
		super();
		this.loaiVang = "";
	}
	
	public GiaoDichVang(String maGD, String ngayGD, double donGia, int soLuong,String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	@Override
	public double thanhTien() {
		return soLuong * donGia;
	}
	
	@Override
	public String toString() {
		return "GIAO DỊCH VÀNG -- "+super.toString() + ", Loại vàng: "+loaiVang;
	}
	
}
