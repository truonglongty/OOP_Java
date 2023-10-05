package tuan1.tamgiac;

public class TestTamGiac {
	public static void main(String[] args) {	
		 TamGiac tg1 = new TamGiac(6, 8, 1); 
	     TamGiac tg2 = new TamGiac(-1, 2, 3); 
	     TamGiac tg3 = new TamGiac(6, 7, 8); 
	     TamGiac tg4 = new TamGiac(3, 3, 4); 
	     TamGiac tg5 = new TamGiac(4, 4, 4); 
	     TamGiac[] tamGiacArray = {tg1, tg2, tg3, tg4, tg5};
	     System.out.println(TamGiac.tieuDe());
	     System.out.println("---------------------------------------------------------------");
	     for (TamGiac tg : tamGiacArray) {
	    	 System.out.println(tg);
	     }
	     System.out.println("---------------------------------------------------------------");
	}
}	
