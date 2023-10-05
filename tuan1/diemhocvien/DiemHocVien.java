package tuan1.diemhocvien;

import java.util.ArrayList;
import java.util.List;

public class DiemHocVien {
	private String hoTen;
	private int namSinh;
	private float diemMon1, diemMon2, diemMon3, diemMon4, diemMon5;
	public DiemHocVien(String hoTen, int namSinh, float diemMon1, float diemMon2, float diemMon3, float diemMon4,
			float diemMon5) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
		this.diemMon4 = diemMon4;
		this.diemMon5 = diemMon5;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemMon1() {
		return diemMon1;
	}
	public void setDiemMon1(float diemMon1) {
		this.diemMon1 = diemMon1;
	}
	public float getDiemMon2() {
		return diemMon2;
	}
	public void setDiemMon2(float diemMon2) {
		this.diemMon2 = diemMon2;
	}
	public float getDiemMon3() {
		return diemMon3;
	}
	public void setDiemMon3(float diemMon3) {
		this.diemMon3 = diemMon3;
	}
	public float getDiemMon4() {
		return diemMon4;
	}
	public void setDiemMon4(float diemMon4) {
		this.diemMon4 = diemMon4;
	}
	public float getDiemMon5() {
		return diemMon5;
	}
	public void setDiemMon5(float diemMon5) {
		this.diemMon5 = diemMon5;
	}
	
	public float diemTB() {
	return (diemMon1 + diemMon2 + diemMon3 + diemMon4 + diemMon5) / 5;
	}
	
//	public boolean luanVan() {
//		if(diemTB() > 7) {
//			if(diemMon1 > 5 && diemMon2 > 5 && diemMon3 > 5 && diemMon4 > 5 && diemMon5 > 5)
//				return true;
//		}
//		return false;
//	}
//	
//	public boolean totNghiep() {
//		if(diemTB() <= 7) {
//			if(diemMon1 > 5 && diemMon2 > 5 && diemMon3 > 5 && diemMon4 > 5 && diemMon5 > 5)
//				return true;
//		}
//		return false;
//	}
//	
//	public boolean thiLai() {
//		if(diemMon1 < 5 || diemMon2 < 5 || diemMon3 < 5 || diemMon4 < 5 || diemMon5 < 5)
//				return true;
//		return false;
//	}
	
	public String xetKetQua() {
        if (this.diemTB() >= 7 && this.diemMon1 >= 5 && this.diemMon2 >= 5 && this.diemMon3 >= 5 && this.diemMon4 >= 5 && this.diemMon5 >= 5) {
            return "Làm luận văn";
        } else if (this.diemTB() < 7 && this.diemMon1 >= 5 && this.diemMon2 >= 5 && this.diemMon3 >= 5 && this.diemMon4 >= 5 && this.diemMon5 >= 5) {
            return "Thi tốt nghiệp";
        } else {
            return "Thi lại";
        }
    }
	
	 public List<Integer> getDanhSachMonThiLai() {
	        List<Integer> danhSachDiemThap = new ArrayList<>();
	        for (int diem : new int[]{(int) this.diemMon1, (int) this.diemMon2, (int) this.diemMon3, (int) this.diemMon4, (int) this.diemMon5}) {
	            if (diem < 5) {
	                danhSachDiemThap.add(diem);
	            }
	        }
	        return danhSachDiemThap;
	    }
	
}
