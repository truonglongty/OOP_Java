package module4.sinhvien;

import java.util.ArrayList;
import java.util.Collections;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> ds;

	public DanhSachSinhVien() {
		ds = new ArrayList<SinhVien>();
	}
	
	public boolean them(SinhVien sv) {
		if(ds.contains(sv))
			return false;
		ds.add(sv);
		return true;
	}
	
	public SinhVien timTheoMa(String maSo) {
		for (SinhVien sv : ds) {
			if(sv.getMssv().equalsIgnoreCase(maSo))
				return sv;
		}
		return null;
	}
	
	public boolean xoa(String maSo) {
		if(timTheoMa(maSo) == null)
			return false;
		ds.remove(timTheoMa(maSo));
		return true;
	}  
	
	public boolean capNhat(String maSo, String newName, int newNam) {
		if(timTheoMa(maSo) == null)
			return false;
		for (SinhVien sv : ds) {
			if(sv.getMssv().equalsIgnoreCase(maSo)) {
				sv.setHoTen(newName);
				sv.setNam(newNam);
			}
		}
		return true;
	}
	
	public SinhVien timTheoTen(String ten) {
		for(SinhVien sv : ds) {
			if(sv.getHoTen().equalsIgnoreCase(ten))
				return sv;
		}
		return null;
	}
	
	public void sapMaTang() {
		Collections.sort(ds);
	}

	public void xuat() {
		for (SinhVien sv : ds) {
			System.out.println(sv);
		}
	}
	
}
