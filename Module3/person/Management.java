package Module3.person;

public class Management {
	private Person[] ls;
	int count;
	
	public Management(int n) {
		ls = new Person[n];
		count = 0;
	}
	
	public void add(Person p) {
		if(count >= ls.length) {
			Person[] tmp = new Person[ls.length * 2];
			System.arraycopy(ls, 0, tmp, 0, ls.length);
			ls = tmp;
		}
		ls[count++] = p;
	}
	
	public Person tim(String hoTen) {
		for(int i=0; i<count; i++) {
			if(ls[i].hoTen.equalsIgnoreCase(hoTen))
				return ls[i];
		}
		return null;
	}
	
	public boolean xoa(String hoTen) {
		if(tim(hoTen) == null)
			return false;
		Person tmp[] = new Person[count];
		int j = 0, cnt = 0;
		for(int i=0; i<count; i++) {
			if(!ls[i].hoTen.equalsIgnoreCase(hoTen)) {
				tmp[j++] = ls[i];
				++cnt;
			}
		}
		ls = tmp;
		count = cnt;
		return true;
	}
	
	public void sapHoTen() {
		for(int i=0; i<count-1; i++) {
			int min = i;
			for(int j=i+1; j<count; j++) {
				if(ls[min].hoTen.compareToIgnoreCase(ls[j].hoTen) > 0)
					min = j;
			}
			Person tmp = ls[i];
			ls[i] = ls[min];
			ls[min] = tmp;
		}
	}
	
	public String xuat() {
		String s = String.format("%30s %50s %15s\n","Ho_tên","Địa_chỉ","Loại_người");
		for(int i=0; i<count; i++) {
			s += String.format("%30s %50s %15s\n",ls[i].hoTen,ls[i].diaChi,ls[i].getClass().getSimpleName());
		}
		return s;
	}
}
