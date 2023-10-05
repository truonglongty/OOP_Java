package tuan1.hinhtron;

public class TestHinhTron {
	public static void main(String[] args) throws Exception {
		ToaDo td1 = new ToaDo("P",5,5);
		HinhTron ht1 = new HinhTron(td1,10.5);
		System.out.println(ht1);
	}
}
