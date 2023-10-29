package Module3.thuephong;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private double soGioThue;
	
	public HoaDonTheoGio() {
		super();
	}
	public HoaDonTheoGio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, double soGioThue) throws Exception {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		setSoGioThue(soGioThue);
	}

	public double getSoGioThue() {
		return soGioThue;
	}
	public void setSoGioThue(double soGioThue) throws Exception {
		if(soGioThue>0 && soGioThue<24)
			this.soGioThue = soGioThue;
		else if(soGioThue > 24 && soGioThue <30)
			this.soGioThue = 24;
		else
			throw new Exception("Error! Số giờ > 30");
	}
	
	@Override
	public double thanhTien() {
		return soGioThue * donGia;
	}
	
	@Override
	public String toString() {
		return "HÓA ĐƠN THEO GIỜ -- "+super.toString()+" , Số giờ thuê: "+soGioThue+" ,Thành tiền: "+thanhTien();
	}
	
}
