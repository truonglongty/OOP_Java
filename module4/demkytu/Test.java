package module4.demkytu;

public class Test {
	public static void main(String[] args) {
		DemKyTu d = new DemKyTu();
		System.out.println("Length: "+d.getStringLength("TEST"));
		System.out.println("Length: "+d.getStringLength("HELLO"));
		System.out.println("Length: "+d.getStringLength("ANY"));
		System.out.println("Length: "+d.getStringLength("TEST"));
	}
}
