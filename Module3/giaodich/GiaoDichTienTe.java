package Module3.giaodich;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private LoaiTienTe  loaiTienTe;
	
	public GiaoDichTienTe() {
		super();
		this.tiGia = 0;
		this.loaiTienTe = LoaiTienTe.VN;
	}

	public GiaoDichTienTe(String maGD, String ngayGD, double donGia, int soLuong,double tiGia, LoaiTienTe loaiTienTe) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public LoaiTienTe getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(LoaiTienTe loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	
	@Override
	public double thanhTien() {
		if(loaiTienTe == LoaiTienTe.Euro || loaiTienTe == LoaiTienTe.USD)
			return soLuong * donGia * tiGia;
		else if(loaiTienTe == LoaiTienTe.VN)
			return soLuong * donGia;
		return 0;
	}
	
	@Override
	public String toString() {
		return "GIAO DỊCH TIỀN TỆ -- "+super.toString()+",Tỉ giá: "+tiGia+",Loại tiền tệ: "+loaiTienTe;
	}
	
}
