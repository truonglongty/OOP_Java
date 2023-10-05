package tuan1.cd;

import java.util.Arrays;

public class CDList {
	private CD[] list;
	private int count = 0;
	
	public CDList(int n) {
		list = new CD[n];
		count = 0;
	}
	
	public boolean add(CD cd) {
		if(count < list.length) {
			list[count++] = cd;
			return true;
		}
		return false;
	}
	 
	public int soLuongCD() {
		return count;
	}
	
	public double tongGiaThanh() {
		double s = 0;
		for(int i=0; i<count; i++) {
			s += list[i].getGiaThanh();
		}
		return s;
	}
	
	@Override
	public String toString() {
		System.out.println(CD.tieuDe());
		String s = "";
		for(int i=0; i<count; i++) {
			s += list[i].toString() + "\n";
		}
		return s;
	}
	
	public boolean timTheoMa(int maCD) {
		for(int i=0; i<count; i++) {
			if(list[i].getMaCD() == maCD)
				return true;
		}
		return false;
	}
	
	public void sortGiamGiaThanh() {
		for(int i = 0; i<count; i++) {
			int pos = i;
			for(int j = i+1; j<count; j++) {
				if(list[pos].getGiaThanh() < list[j].getGiaThanh()) {
					pos = j;
				}
			}
			CD tmp = list[i];
			list[i] = list[pos];
			list[pos] = tmp;
		}
	}
	public void sortTangTuaCD() {
		Arrays.sort(list, 0, count, (cd1, cd2) -> cd1.getTuaCD().compareTo(cd2.getTuaCD()));
	}
	

}
