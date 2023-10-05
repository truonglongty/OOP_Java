package tuan1.congnhan;

public class DanhSachCongNhan {
	private CongNhan[] list;
	private int count;
	
	public DanhSachCongNhan(int n) {
		list = new CongNhan[n];
		count = 0;
	}
	
	public boolean add(CongNhan cn) {
		if(count >= list.length) {
			System.out.println("Danh sách đầy");
			return false;
		}
		if(count < list.length) {
			list[count++] = cn;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<count; i++) {
			s += list[i].toString() + "\n";
		}
		return s;
	}
	
	public int getSoLuongCN() {
		return count;
	}
	
	public String toString200() {
		String s= "";
		for(int i=1; i<count; i++) {
			if(list[i].getmSoSP() > 200)
				s += list[i].toString() + "\n";
		}
		return s;
	}
	
	public void sortGiamSP() {
		for(int i=0; i<count-1; i++) {
			int pos = i;
			for(int j=i+1; j<count; j++) {
				if(list[pos].getmSoSP() < list[j].getmSoSP())
					pos = j;
			}
			CongNhan tmp = list[i];
			list[i] = list[pos];
			list[pos] = tmp;
		}
	}
	
	
	
}
