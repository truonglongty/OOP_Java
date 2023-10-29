package Module3.giaodichnhadat;

public class Test {
	public static void main(String[] args) {
		GiaoDich list[] = new GiaoDich[6];
		
        list[0] = new GiaoDichDat("GDDD002", "2023-09-15", 4000000,150, LoaiDat.A);
        list[1] = new GiaoDichDat("GDDD003", "2023-09-20", 3000000,200, LoaiDat.B);
        list[2] = new GiaoDichDat("GDDD001", "2013-09-10", 5000000,100, LoaiDat.C);
        list[3] = new GiaoDichNha("GDNH001", "2023-09-10", 2000000000, 300, LoaiNha.CaoCap, "123 Đường ABC");
        list[4] = new GiaoDichNha("GDNH002", "2023-09-15", 1000000000, 250, LoaiNha.Thuong, "456 Đường XYZ");
        list[5] = new GiaoDichNha("GDNH003", "2013-09-20", 1500000000, 200, LoaiNha.CaoCap, "789 Đường DEF");
        
        for(GiaoDich x : list) {
        	System.out.println(x);
        }
        //Tổng số giao dịch 
        int soGDDat = 0, soGDNha = 0;
        for(GiaoDich x : list) {
        	if(x instanceof GiaoDichDat) {
        		soGDDat++;
        	}
        	else
        		soGDNha++;
        }
        System.out.println("\nTổng số giao dịch đât: "+soGDDat);
        System.out.println("Tổng số giao dịch nhà: "+soGDNha);
        System.out.println("Tống số giao dich: "+(soGDDat + soGDNha));
        
        double tbThanhTienDat = 0;
        int cnt = 0;
        for(GiaoDich x : list) {
        	if(x instanceof GiaoDichDat) {
        		tbThanhTienDat += x.thanhTien();
        		++cnt;
        	}
        }
        System.out.println("\nTrung bình thành tiền đất: "+(tbThanhTienDat / cnt)+"\n");
        
        for(GiaoDich x : list) {
        	if(x.getNgayGD().startsWith("2013-09"))
        		System.out.println(x);
        }
	}
}
