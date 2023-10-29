package Module3.giaodichnhadat;

public class GiaoDichDat extends GiaoDich{
	private LoaiDat loaiDat;

	public GiaoDichDat(String maGD, String ngayGD, double donGia, double dienTich, LoaiDat loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public LoaiDat getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(LoaiDat loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	@Override
	public double thanhTien() {
		if(loaiDat == LoaiDat.B || loaiDat == LoaiDat.C)
			return dienTich * donGia;
		else if(loaiDat == LoaiDat.A)
			return dienTich * donGia * 1.5;
		return 0;
	}
	
	@Override
	public String toString() {
		return "GIAO DỊCH ĐẤT -- "+super.toString()+",Loại đất: "+loaiDat;
	}
}
