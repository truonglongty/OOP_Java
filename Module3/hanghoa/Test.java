package Module3.hanghoa;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		DanhSachHangHoa ds = new DanhSachHangHoa(100);
		
		ds.them(new HangThucPham("TP001","Mì",50000,10,"Hảo Hảo",
				LocalDate.of(2023,2,15),LocalDate.of(2023,10,15)));
		ds.them(new HangDienMay("DM001","Tủ lạnh",5000000,3,10,2000));
		ds.them(new HangSanhSu("SS001","Tô",150000,100,"Nhà sản xuất 1",LocalDate.of(2023,2,9)));
		
		while(true) {
			System.out.println("====================MENU====================");
			System.out.println("1. Thêm hàng hóa");
			System.out.println("2. Lấy thông tin toàn bộ hàng hóa");
			System.out.println("3. Lấy thông tin từng loại hàng hóa");
			System.out.println("4. Tìm hàng hóa với mã hàng");
			System.out.println("5. Sắp xếp hàng hóa theo tên hàng tăng dần");
			System.out.println("6. Sắp xếp hàng hóa theo số lượng giảm dần");
			System.out.println("7. Lấy thông tin các hàng thực phẩm khó bán");
			System.out.println("8. Xóa hàng");
			System.out.println("9. Sửa thông tin hàng");
			System.out.println("0. Thoát");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập lựa chọn: ");
			int lc = sc.nextInt();
			
			if(lc == 1) {
				System.out.println("1. Thêm HÀNG THỰC PHẨM");
				System.out.println("2. Thêm HÀNG ĐIỆN MÁY");
				System.out.println("3. Thêm HÀNG SÀNH SỨ");
				System.out.println("Nhập lựa chọn: ");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.println("Nhập mã hàng: ");
					sc.nextLine();
					String maHang = sc.nextLine();
					ds.them(new HangThucPham(maHang,"Gạo",17000,1000,"Lộc trời",
							LocalDate.of(2023,1,1),LocalDate.of(2023,10,10)));
				}
				else if(choice == 2) {
					System.out.println("Nhập mã hàng: ");
					sc.nextLine();
					String maHang = sc.nextLine();
					ds.them(new HangDienMay(maHang, "Bếp hồng ngoại",2000000,5,12,2000));
				}
				else if(choice == 3) {
					System.out.println("Nhập mã hàng: ");
					sc.nextLine();
					String maHang = sc.nextLine();
					ds.them(new HangSanhSu(maHang,"Dĩa",15000,100,"Nhà sản xuất 2",
							LocalDate.of(2023,2,2)));
				}
			
			}
			else if(lc == 2) {
				System.out.println("Thông tin toàn bộ danh sách\n");
				System.out.println(ds.getAllInfor());
			}
			else if(lc == 3) {
				System.out.println("\nDANH SÁCH HÀNG THỰC PHẨM");
				System.out.println(ds.getInforHangThucPham());
				System.out.println("\nDANH SÁCH HÀNG ĐIỆN MÁY");
				System.out.println(ds.getInforHangDienMay());
				System.out.println("\nDANH SÁCH HÀNG SÀNH SỨ");
				System.out.println(ds.getInforHangSanhSu());
			}
			else if(lc == 4) {
				System.out.println("Nhập mã hàng cần tìm");
				sc.nextLine();
				String mh = sc.nextLine();
				HangHoa hh = ds.tim(mh);
				if(hh != null)
					System.out.println(hh);
				else
					System.out.println("Không tìm thấy hàng có mã: "+mh);
			}
			else if(lc == 5) {
				ds.sapTenHangTangDan();
				System.out.println(ds.getAllInfor());
			}
			else if(lc == 6) {
				ds.sapSoLuongTonGiamDan();
				System.out.println(ds.getAllInfor());
			}
			else if(lc == 7) {
				System.out.println(ds.getInforHangThucPhamKhoBan());
			}
			else if(lc == 8) {
				System.out.println("Nhập mã hàng cần xóa");
				sc.nextLine();
				String maHang = sc.nextLine();
				if(ds.xoa(maHang) == false)
					System.out.println("Không tìm thấy hàng có mã: "+maHang);
				else
					System.out.println("Đã xóa hàng có mã: "+maHang);
			}
			else if(lc == 9) {
				System.out.println("Nhập mã hàng cần sửa: ");
				sc.nextLine();
				String ma = sc.nextLine(); 
				HangHoa hh = ds.tim(ma);
				if (hh != null) {
				    System.out.println("Nhập đơn giá mới: ");
				    double donGia = sc.nextDouble(); 

				    if (ds.suaDonGia(ma, donGia))
				        System.out.println("Cập nhật thành công");
				    else 
				        System.out.println("Không tìm thấy hàng có mã: " + ma);
				} 
				else 
				    System.out.println("Không tìm thấy hàng có mã: " + ma);
				

			}
			else
				break;
		}
	}
	
	
}
