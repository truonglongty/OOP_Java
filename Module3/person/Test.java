package Module3.person;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management(100);
        management.add(new Student("Nguyen Van A", "123 ABC Street", 8.5, 7.5));
        management.add(new Employee("Hoang Van D", "101 PQR Street", 2.5));
        management.add(new Customer("Nguoi dai dien","Cong Ty 1", "1 Company Road", 1500.0));

        while (true) {
            System.out.println("======== MENU ========");
            System.out.println("1. Thêm người mới");
            System.out.println("2. Tìm kiếm người theo tên");
            System.out.println("3. Xóa người theo tên");
            System.out.println("4. Sắp xếp danh sách theo thứ tự họ tên");
            System.out.println("5. Xuất danh sách");
            System.out.println("0. Thoát");
            
            System.out.println("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại người:");
                    System.out.println("1. Sinh viên");
                    System.out.println("2. Nhân viên");
                    System.out.println("3. Khách hàng");
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    Person person = null;

                    switch (typeChoice) {
                        case 1:
                            System.out.print("Nhập điểm môn học 1: ");
                            double diem1 = scanner.nextDouble();
                            System.out.print("Nhập điểm môn học 2: ");
                            double diem2 = scanner.nextDouble();
                            person = new Student(hoTen, diaChi, diem1, diem2);
                            break;
                        case 2:
                            System.out.print("Nhập hệ số lương: ");
                            double heSoLuong = scanner.nextDouble();
                            person = new Employee(hoTen, diaChi, heSoLuong);
                            break;
                        case 3:
                            System.out.print("Nhập tên công ty: ");
                            String tenCongTy = scanner.nextLine();
                            System.out.print("Nhập trị giá hóa đơn: ");
                            double triGiaHD = scanner.nextDouble();
                            person = new Customer(hoTen, diaChi, tenCongTy, triGiaHD);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }

                    if (person != null) {
                        management.add(person);
                        System.out.println("Đã thêm người mới vào danh sách.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    Person foundPerson = management.tim(searchName);
                    if (foundPerson != null) {
                        System.out.println("Người có tên " + searchName + " được tìm thấy:");
                        System.out.println(foundPerson);
                    } else {
                        System.out.println("Không tìm thấy người có tên " + searchName);
                    }
                    break;

                case 3:
                    System.out.print("Nhập tên cần xóa: ");
                    String removeName = scanner.nextLine();
                    boolean removed = management.xoa(removeName);
                    if (removed) {
                        System.out.println("Đã xóa người có tên " + removeName + " khỏi danh sách.");
                    } else {
                        System.out.println("Không tìm thấy người có tên " + removeName + " để xóa.");
                    }
                    break;

                case 4:
                    management.sapHoTen();;
                    System.out.println(management.xuat());
                    break;

                case 5:
                    System.out.println("======== Danh sách người ========");
                    System.out.println(management.xuat());
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}
