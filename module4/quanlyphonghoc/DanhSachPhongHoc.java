package module4.quanlyphonghoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachPhongHoc{
	private ArrayList<PhongHoc> ds;

	public DanhSachPhongHoc() {
		ds = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhongHoc(PhongHoc ph) {
		if(ds.contains(ph))
			return false;
		ds.add(ph);
		return true;
	}
	
	public PhongHoc timKiem(String maPhong) {
		for (PhongHoc ph : ds) {
			if(ph.getMaPhong().equalsIgnoreCase(maPhong))
				return ph;
		}
		return null;
	}
	
	public String getAllInfo() {
		String s = "";
		for (PhongHoc ph : ds) 
			s += ph.toString()+ "\n";
		return s;
	}
	
	public String getInfoDatChuan() {
		String s = "";
		for (PhongHoc ph : ds) {
			if(ph.datChuan())
				s += ph.toString() + "\n";
		}
		return s;
	}
	
	public void sapTangDayNha() {
		Collections.sort(ds, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if(o1 != null && o2 != null)
					return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
				return 0;
			}
		});
	}
	
	public void sapGiamDienTich() {
		Collections.sort(ds, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				//return o1.getDienTich() > o2.getDienTich() ? -1 : 1;
				if(o1 != null && o2 != null) {
					if(o1.getDienTich() > o2.getDienTich())
						return -1;
					else if(o1.getDienTich() < o2.getDienTich())
						return 1;
					return 0;
				}
				return 0;
			}
		});
	}
	
	public void sapTangSoBongDen() {
		Collections.sort(ds, new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				if(o1 != null && o2 != null) {
					if(o1.getSoBongDen() > o2.getSoBongDen())
						return 1;
					else if(o1.getSoBongDen() < o2.getSoBongDen())
						return -1;
					return 0;
				}
				return 0;
			}
			
		});
	}
	
	public boolean capNhatSoMayTinh(String maPhong, int newSoMayTinh) {
		for (PhongHoc ph : ds) {
			if(ph instanceof PhongMayTinh) {
				if(ph.getMaPhong().equalsIgnoreCase(maPhong)) {
					((PhongMayTinh) ph).setSoMayTinh(newSoMayTinh);
					return true;
				}	
			}
		}
		return false;
	}
	
	public boolean xoa(String maPhong) {
		for (PhongHoc ph : ds) {
			if(ph.getMaPhong().equalsIgnoreCase(maPhong)) {
				ds.remove(ph);
				return true;
			}	
		}
		return false;
	}
	
	public int tongPhongHoc() {
		return ds.size();
	}
	
	public ArrayList<PhongMayTinh> layDanhSachPhongMay60May() {
        ArrayList<PhongMayTinh> phongMay60May = new ArrayList<>();
        for (PhongHoc ph : ds) {
            if (ph instanceof PhongMayTinh && ((PhongMayTinh) ph).getSoMayTinh() == 60) {
                phongMay60May.add((PhongMayTinh) ph);
            }
        }
        return phongMay60May;
    }
	
}
