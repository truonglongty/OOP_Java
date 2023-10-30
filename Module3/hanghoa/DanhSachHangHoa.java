package Module3.hanghoa;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachHangHoa {
	private HangHoa[] dsHH;
	int count;
	
	public DanhSachHangHoa(int n) {
		dsHH = new HangHoa[n];
		count = 0;
	}
	
	public boolean them(HangHoa hh) throws Exception {
		for(int i=0; i<count; i++) {
			if(dsHH[i].getMaHang().equalsIgnoreCase(hh.getMaHang()))
				throw new Exception("Hàng có mã: "+hh.getMaHang()+" đã tồn tại trong danh sách");
		}
		dsHH[count++] = hh;
		return true;
	}
	
	public String getAllInfor() {
		String s = String.format("%10s %20s %15s %15s %15s\n", "Mã_hàng", "Tên_hàng", "Đơn_giá", "Số_lượng_tồn","Loại_hàng");
		for(int i=0; i<count; i++) {
			s += String.format("%10s %20s %15s %15s %15s\n",dsHH[i].getMaHang(),dsHH[i].getTenHang(),dsHH[i].getDonGia(),
					dsHH[i].getSoLuong(), dsHH[i].getClass().getSimpleName());
		}
		return s;
	}
	
	public String getInforHangThucPham() {
		String s = HangThucPham.getTieuDe() + "\n";
		for(int i=0; i<count; i++) {
			if(dsHH[i] instanceof HangThucPham)
				s += dsHH[i].toString() + "\n";
		}
		return s;
	}
	
	public String getInforHangDienMay() {
		String s = HangDienMay.getTieuDe() + "\n";
		for(int i=0; i<count; i++) {
			if(dsHH[i] instanceof HangDienMay)
				s += dsHH[i].toString() + "\n";
		}
		return s;
	}
	
	public String getInforHangSanhSu() {
		String s = HangSanhSu.getTieuDe() + "\n";
		for(int i=0; i<count; i++) {
			if(dsHH[i] instanceof HangSanhSu)
				s += dsHH[i].toString() + "\n";
		}
		return s;
	}
	
	public HangHoa tim(String ma) {
		for(int i=0; i<count; i++) {
			if(dsHH[i].getMaHang().equalsIgnoreCase(ma))
				return dsHH[i];
		}
		return null;
	}
	
	public void sapTenHangTangDan() {
		Arrays.sort(dsHH,new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if(o1 != null && o2 != null) {
					if(o1.getTenHang().compareToIgnoreCase(o2.getTenHang()) > 0)
						return 1;
					else if(o1.getTenHang().compareToIgnoreCase(o2.getTenHang()) < 0)
						return -1;
				}
				return 0;
			}
			
		});
	}
	
	public void sapSoLuongTonGiamDan() {
		Arrays.sort(dsHH, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if(o1 != null && o2 != null) {
					if(o1.getSoLuong() > o2.getSoLuong())
						return -1;
					else if(o2.getSoLuong() < o2.getSoLuong())
						return 1;
				}
				return 0;
			}
		});
	}
	
	public String getInforHangThucPhamKhoBan() {
		String s = HangThucPham.getTieuDe() + "\n";
		for(int i=0; i<count; i++) {
			if(dsHH[i] instanceof HangThucPham) {
				if(dsHH[i].danhGia().equalsIgnoreCase("Khó bán"))
					s += dsHH[i].toString() + "\n";
			}
		}
		return s;
	}
	
	public boolean xoa(String maHang) {
		HangHoa hh = tim(maHang);
		if(hh == null)
			return false;
		HangHoa[] tmp = new HangHoa[count-1];
		int j = 0;
		for(int i=0; i<count; i++) {
			if(!dsHH[i].getMaHang().equalsIgnoreCase(maHang))
				tmp[j++] = dsHH[i]; 
		}
		dsHH = tmp;
		count--;
		return true;
	}
	
//	public boolean xoa2(String maHang) {
//		int pos = -1;
//		for(int i=0; i<count; i++) {
//			if(dsHH[i].getMaHang().equalsIgnoreCase(maHang)) {
//				pos = i;
//				break;
//			}
//		}
//		if(pos != -1) {
//			for(int i=pos; i<count; i++) {
//				dsHH[i] = dsHH[i+1];
//			}
//			count--;
//			return true;
//		}
//		return false;
//	}
	
	public boolean suaDonGia(String maHang, double donGia) {
		for(int i=0; i<count; i++) {
			if(dsHH[i].getMaHang().equalsIgnoreCase(maHang)) {
				dsHH[i].setDonGia(donGia);
				return true;
			}
		}
		return false;
	}
}
