package module4.softwarehouse;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		SoftwareHouse ds = new SoftwareHouse("Công ty SoftwareHouse ABC");
		ds.addEmployee(new Programmer(100, "John Doe", 5000, "Java"));
		ds.addEmployee(new Administrator(200, "Alice Smith", 6000, "HR"));
		ds.addEmployee( new ProjectLeader(300, "Bob Johnson", 7000, "PM"));
		
		Scanner sc = new Scanner(System.in);
		int lc;
		do {
			System.out.println("===== MENU =====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị toàn bộ danh sách nhân viên");
            System.out.println("3. Tổng tiền phải trả cho các nhân viên");
            System.out.println("4. Sắp xếp danh sách nhân viên theo tên");
            System.out.println("5. Hiển thị danh sách các lập trình viên");
            System.out.println("6. Cập nhật phòng ban");
            System.out.println("7. Xóa nhân viên theo mã");
            System.out.println("0. Thoát");
			System.out.println("Nhập lựa chọn: ");
			lc = sc.nextInt();
			sc.nextLine();
			switch(lc) {
				case 1: 
					System.out.println("Chọn loại nhân viên: ");
                    System.out.println("1. Programmer");
                    System.out.println("2. Administrator");
                    System.out.println("3. ProjectLeader");
                    int loaiNV = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập mã nhân viên: ");
                    int maNV = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhập lương cơ bản: ");
                    double luong = sc.nextDouble();
                    sc.nextLine();
                    switch(loaiNV) {
                    	case 1:
                    		System.out.println("Nhập ngôn ngữ: ");
                    		String nn = sc.nextLine();
                    		ds.addEmployee(new Programmer(maNV, hoTen, luong, nn));
                    		break;
                    	case 2:
                    		System.out.println("Nhập theDepartment: ");
                    		String de = sc.nextLine();
                    		ds.addEmployee(new Administrator(maNV, hoTen, luong, de));
                    		break;
                    	case 3:
                    		System.out.println("Nhập ngôn ngữ: ");
                    		String nn1 = sc.nextLine();
                    		ds.addEmployee(new Programmer(maNV, hoTen, luong, nn1));
                    	default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
				case 2:
					System.out.println("Danh sách toàn bộ nhân viên: ");
					ds.displayAllStaff();
					break;
				case 3:
					System.out.println("Tổng tiền phải trả cho nhân viên: "+ds.getMonthlySalaryBill());
					break;
				case 4:
					ds.sortAllStaffByName();
					System.out.println("Sắp xếp danh sách nhân viên theo tên");
					ds.displayAllStaff();
					break;
				case 5:
					System.out.println("Danh sách các lập trình viên");
					ds.displayListProgrammers();
					break;
				case 6:
					System.out.println("Nhập mã người quản lý: ");
					int aPayrollNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhập newDepartment: ");
					String deptNew = sc.nextLine();
					if(ds.updateDepartmentForAdmin(aPayrollNo, deptNew))
						System.out.println("Cập nhật thành công");
					else
						System.out.println("Không tìm thấy mã: "+aPayrollNo);
					break;
				case 7:
					System.out.println("Nhập mã cần xóa: ");
					int maXoa = sc.nextInt();
					if(ds.deleteEmployee(maXoa))
						System.out.println("Xóa thành công");
					else
						System.out.println("Không tìm thấy mã: "+maXoa);
					break;
				case 0:
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
			}
				
		}while(lc != 0);
	}
}
