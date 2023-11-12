package module4.bai05;

import Module3.giaodichnhadat.GiaoDich;
import Module3.giaodichnhadat.LoaiNha;

public class GiaoDichNha extends GiaoDich{
	private LoaiNha loaiNha;
	private String diaChi;
	
	public GiaoDichNha(String maGD, String ngayGD, double donGia, double dienTich, LoaiNha loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public LoaiNha getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(LoaiNha loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	@Override
	public double thanhTien() {
		if(loaiNha == LoaiNha.CaoCap)
			return dienTich * donGia;
		else if(loaiNha == LoaiNha.Thuong)
			return dienTich * donGia * 0.9;
		return 0;
	}
	
	@Override
	public String toString() {
		return "GIAO DỊCH NHÀ -- "+super.toString()+", Loại nhà: "+loaiNha+",Địa chỉ: "+diaChi;
	}
	
}
